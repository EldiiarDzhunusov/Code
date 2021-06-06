import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Document;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEldi1_Bot extends TelegramLongPollingBot {

    private HashMap<Long,HashMap<String,String>>  hashMapUserInfo= new HashMap<>();
    private HashMap<Long,Integer> hashMapMessageState = new HashMap<>();
    @Override
    public String getBotUsername() {
        return "testeldi1_bot";
    }

    @Override
    public String getBotToken() {
        return "1665452958:AAGZGVYI3tLCMS32wxiR3JEoDK9SnRta9Yc";
    }

    @Override
    public void onUpdateReceived(Update update) {

        if(update.hasMessage() && update.getMessage().hasText()){
            long chat_id = update.getMessage().getChatId();
            String command = update.getMessage().getText();
            SendMessage message = new SendMessage();
            message.setChatId(String.valueOf(update.getMessage().getChatId()));

            if(command.equals("/start")){
                message.setText("Доброго времени суток\nЯ помогу найти тебе работу\nПожалуйста введите свое имя");
                hashMapMessageState.put(update.getMessage().getChatId(),0);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if(command.equals("/printall")){
                listAllEmployee(update);
            }
            else if(hashMapMessageState.get(update.getMessage().getChatId())==0){
                HashMap<String,String> nameHashMap = new HashMap<>();
                nameHashMap.put("id", String.valueOf(update.getMessage().getChatId()));
                nameHashMap.put("name",update.getMessage().getText());
                hashMapUserInfo.put(update.getMessage().getChatId(),nameHashMap);
                hashMapMessageState.put(update.getMessage().getChatId(),1);
                message.setText("Спасибо!\nОтправьте пожалуйста ваш Email адрес");
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if(hashMapMessageState.get(update.getMessage().getChatId())==1){
                //for email
                if(emailChecker(update.getMessage().getText())){
                    HashMap<String,String> emailHashMap = hashMapUserInfo.get(update.getMessage().getChatId());
                    emailHashMap.put("email",update.getMessage().getText());
                    hashMapMessageState.put(chat_id,2);
                    message.setText(String.format("Спасибо %s !\nНазовите ваше направление",emailHashMap.get("name")  ));

                    //buttons for skill path
                    List<List<InlineKeyboardButton>> rowsInLine = new ArrayList<>();
                    //first button in the first line
                    List<InlineKeyboardButton> rowInLine = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButtonFrontEnd = new InlineKeyboardButton();
                    inlineKeyboardButtonFrontEnd.setText("Front-End");
                    inlineKeyboardButtonFrontEnd.setCallbackData("frontEnd");
                    rowInLine.add(inlineKeyboardButtonFrontEnd);
                    //second Button on the same line
                    InlineKeyboardButton inlineKeyboardButtonBackEnd = new InlineKeyboardButton();
                    inlineKeyboardButtonBackEnd.setText("Back-End");
                    inlineKeyboardButtonBackEnd.setCallbackData("backEnd");
                    rowInLine.add(inlineKeyboardButtonBackEnd);
                    rowsInLine.add(rowInLine);

                    //add it to text
                    InlineKeyboardMarkup markupInLine = new InlineKeyboardMarkup();
                    markupInLine.setKeyboard(rowsInLine);
                    message.setReplyMarkup(markupInLine);
                    //end buttons
                }
                else{
                    message.setText("Not Valid email, please re-enter");
                }
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            else if(hashMapMessageState.get(update.getMessage().getChatId())==2){
                //stack technology
                hashMapMessageState.put(update.getMessage().getChatId(),3);
                String skills = update.getMessage().getText();

                HashMap<String,String> nameHashMap = hashMapUserInfo.get(update.getMessage().getChatId());
                nameHashMap.put("skills",skills);
                hashMapUserInfo.put(update.getMessage().getChatId(),nameHashMap);
                message.setText("Теперь отправьте пожалуйста свое резюме.");
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }

            else if(command.equals("/help")){
                message.setText("In order to use this bot, use following commands:\n/myfirstname\n/mylastname\n/myfullname");
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else{
                message.setText("Not valid command");
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }



        else if(update.hasCallbackQuery()){
            String call_data = update.getCallbackQuery().getData();
            long message_id = update.getCallbackQuery().getMessage().getMessageId();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();
            EditMessageText editMessageText = new EditMessageText();

            if(call_data.equals("frontEnd")){
                String answer = "Отправьте Стэк технологий который вы знаете \nодним текстом через пробел";

                editMessageText.setChatId(String.valueOf(chat_id));
                editMessageText.setMessageId((int) message_id);
                editMessageText.setText(answer);
                HashMap<String,String> pathHashMap = hashMapUserInfo.get(chat_id);
                pathHashMap.put("pathSkill",call_data);
                hashMapUserInfo.put(chat_id,pathHashMap);

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if(call_data.equals("backEnd")){
                HashMap<String,String> pathHashMap = hashMapUserInfo.get(chat_id);
                pathHashMap.put("pathSkill",call_data);
                hashMapUserInfo.put(chat_id,pathHashMap);

                String answer = "Отправьте Стэк технологий который вы знаете \nодним текстом через пробел";

                editMessageText.setChatId(String.valueOf(chat_id));
                editMessageText.setMessageId((int) message_id);
                editMessageText.setText(answer);

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }

        else if(update.hasMessage() && update.getMessage().hasDocument()){
            long chat_id = update.getMessage().getChatId();
            Document doc = update.getMessage().getDocument();

            List<Document> documents = new ArrayList<>();
            documents.add(update.getMessage().getDocument());

            String f_id = documents.stream().sorted(Comparator.comparing(Document::getFileSize).reversed()).findFirst().orElse(null).getFileId();
            //String f_id = doc.getFileUniqueId();
            HashMap<String,String> nameHashMap = hashMapUserInfo.get(update.getMessage().getChatId());
            nameHashMap.put("fileId",f_id);
            hashMapUserInfo.put(update.getMessage().getChatId(),nameHashMap);

            String[] skills = hashMapUserInfo.get(chat_id).get("skills").split(" ");
            String skillsToSend = String.join(", ", skills);
            String response = "\n" +
                    "Спасибо за ваш ответ, мы внесли вас в нашу базу, ожидайте заявок\n" +
                    "\nВаша Анкета:" +
                    "\nИмя: " + hashMapUserInfo.get(chat_id).get("name") +
                    "\nВаша почта: " +hashMapUserInfo.get(chat_id).get("email") +
                    "\nВаши навыки: " + skillsToSend+"\n";
            SendDocument docToSend = new SendDocument();
            docToSend.setChatId(String.valueOf(chat_id));
            docToSend.setCaption(response);
            InputFile inputFile = new InputFile();
            inputFile.setMedia(f_id);
            docToSend.setDocument(inputFile);
            try {
                execute(docToSend);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }
        else{
            SendMessage message = new SendMessage();
            message.setChatId(String.valueOf(update.getMessage().getChatId()));
            message.setText("Not valid Input");
            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }



    }
    public boolean emailChecker(String email){
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(email);
        return mat.matches();
    }
    public void listAllEmployee(Update update){
        long chat_id = update.getMessage().getChatId();
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chat_id));
        String response = "All Applications:\n";
        for(Long userId : hashMapUserInfo.keySet()){
            HashMap<String, String> hashMapTemp= hashMapUserInfo.get(userId);
            String[] skills = hashMapUserInfo.get(userId).get("skills").split(" ");
            String skillsToSend = String.join(", ", skills);
            String userInfo = "\n" +
                    "Анкета\n" +
                    "\nИмя: " + hashMapUserInfo.get(userId).get("name") +
                    "\nПочта: " +hashMapUserInfo.get(userId).get("email") +
                    "\nНаправление: " + hashMapUserInfo.get(userId).get("pathSkill")+
                    "\nНавыки: " + skillsToSend+
                    "\nID файла: " + hashMapUserInfo.get(userId).get("fileId")+
                    "\n";
            response+=userInfo;
        }
        message.setText(response);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
//    public void createDataBase(){
//        String sqlSelectAllPersons = "SELECT * FROM person";
//        String connectionUrl = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
//
//        try (Connection conn = DriverManager.getConnection(connectionUrl, "username", "password");
//             PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
//             ResultSet rs = ps.executeQuery()) {
//
//            while (rs.next()) {
//                long id = rs.getLong("ID");
//                String name = rs.getString("FIRST_NAME");
//                String lastName = rs.getString("LAST_NAME");
//
//                // do something with the extracted data...
//            }
//        } catch (SQLException e) {
//            // handle the exception
//        }
//    }

}