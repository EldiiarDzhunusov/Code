public class _657 {
    public boolean judgeCircle(String moves) {
        int xPos=0;
        int yPos=0;
        for(int i =0; i<moves.length(); i++){
            char move = moves.charAt(i);
            switch (move){
                case 'U':
                    xPos++;
                    break;
                case 'D':
                    xPos--;
                    break;
                case 'L':
                    yPos--;
                    break;
                case 'R':
                    yPos++;
                    break;
            }
        }
        if(yPos==0 && xPos == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
