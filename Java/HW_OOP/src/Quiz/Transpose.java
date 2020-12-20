package Quiz;

import java.util.stream.Stream;

class Transpose{
    //split with \\
    public String transpose(String matrixAsString){
        String[] word = matrixAsString.split("\\n");
        StringBuilder finalMatrix = new StringBuilder();
        int maxLength = Stream.of(word).mapToInt(String::length).max().getAsInt();
        for (int index = 0; index < maxLength; index++) {
            StringBuilder matrixLine = new StringBuilder();
            for (int i = 0; i < word.length; i++) {
                if (index < word[i].length()) {
                    matrixLine.append(word[i].charAt(index));
                } else {
                    boolean addSpace = false;
                    for (int k = i + 1; k < word.length && !addSpace; k++) {
                        if (index < word[k].length()) {
                            addSpace = true;
                        }
                    }
                    if (addSpace) {
                        matrixLine.append(" ");
                    }
                }
            }

            finalMatrix.append(matrixLine);
            if (index != maxLength - 1) {
                finalMatrix.append("\n");
            }
        }
        return finalMatrix.toString();
    }
}