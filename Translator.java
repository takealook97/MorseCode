public class Translator {
    String getText2Morse(String[] input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length; i++) {//문장
            switch (input[i]) {
                case "a", "A" -> result.append(MorseConstant.A);
                case "b", "B" -> result.append(MorseConstant.B);
                case "c", "C" -> result.append(MorseConstant.C);
                case "d", "D" -> result.append(MorseConstant.D);
                case "e", "E" -> result.append(MorseConstant.E);
                case "f", "F" -> result.append(MorseConstant.F);
                case "g", "G" -> result.append(MorseConstant.G);
                case "h", "H" -> result.append(MorseConstant.H);
                case "i", "I" -> result.append(MorseConstant.I);
                case "j", "J" -> result.append(MorseConstant.J);
                case "k", "K" -> result.append(MorseConstant.K);
                case "l", "L" -> result.append(MorseConstant.L);
                case "m", "M" -> result.append(MorseConstant.M);
                case "n", "N" -> result.append(MorseConstant.N);
                case "o", "O" -> result.append(MorseConstant.O);
                case "p", "P" -> result.append(MorseConstant.P);
                case "q", "Q" -> result.append(MorseConstant.Q);
                case "r", "R" -> result.append(MorseConstant.R);
                case "s", "S" -> result.append(MorseConstant.S);
                case "t", "T" -> result.append(MorseConstant.T);
                case "u", "U" -> result.append(MorseConstant.U);
                case "v", "V" -> result.append(MorseConstant.V);
                case "w", "W" -> result.append(MorseConstant.W);
                case "x", "X" -> result.append(MorseConstant.X);
                case "y", "Y" -> result.append(MorseConstant.Y);
                case "z", "Z" -> result.append(MorseConstant.Z);
                case "0" -> result.append(MorseConstant.ZERO);
                case "1" -> result.append(MorseConstant.ONE);
                case "2" -> result.append(MorseConstant.TWO);
                case "3" -> result.append(MorseConstant.THREE);
                case "4" -> result.append(MorseConstant.FOUR);
                case "5" -> result.append(MorseConstant.FIVE);
                case "6" -> result.append(MorseConstant.SIX);
                case "7" -> result.append(MorseConstant.SEVEN);
                case "8" -> result.append(MorseConstant.EIGHT);
                case "9" -> result.append(MorseConstant.NINE);
                case " " -> result.append(" ");
            }
            result.append(" ");
        }
        return result.toString();
    }

    String getMorse2Text(String[] input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            String[] eachLetter = input[i].split(" ");
            for (int j = 0; j < eachLetter.length; j++) {
                switch (eachLetter[j]) {
                    case MorseConstant.A -> result.append("A");
                    case MorseConstant.B -> result.append("B");
                    case MorseConstant.C -> result.append("C");
                    case MorseConstant.D -> result.append("D");
                    case MorseConstant.E -> result.append("E");
                    case MorseConstant.F -> result.append("F");
                    case MorseConstant.G -> result.append("G");
                    case MorseConstant.H -> result.append("H");
                    case MorseConstant.I -> result.append("I");
                    case MorseConstant.J -> result.append("J");
                    case MorseConstant.K -> result.append("K");
                    case MorseConstant.L -> result.append("L");
                    case MorseConstant.M -> result.append("M");
                    case MorseConstant.N -> result.append("N");
                    case MorseConstant.O -> result.append("O");
                    case MorseConstant.P -> result.append("P");
                    case MorseConstant.Q -> result.append("Q");
                    case MorseConstant.R -> result.append("R");
                    case MorseConstant.S -> result.append("S");
                    case MorseConstant.T -> result.append("T");
                    case MorseConstant.U -> result.append("U");
                    case MorseConstant.V -> result.append("V");
                    case MorseConstant.W -> result.append("W");
                    case MorseConstant.X -> result.append("X");
                    case MorseConstant.Y -> result.append("Y");
                    case MorseConstant.Z -> result.append("Z");
                    case MorseConstant.ZERO -> result.append("0");
                    case MorseConstant.ONE -> result.append("1");
                    case MorseConstant.TWO -> result.append("2");
                    case MorseConstant.THREE -> result.append("3");
                    case MorseConstant.FOUR -> result.append("4");
                    case MorseConstant.FIVE -> result.append("5");
                    case MorseConstant.SIX -> result.append("6");
                    case MorseConstant.SEVEN -> result.append("7");
                    case MorseConstant.EIGHT -> result.append("8");
                    case MorseConstant.NINE -> result.append("9");
//                case " " -> result.append(" ");
//                default -> result.append(" ");
                }
            }
            result.append(" ");
        }
        return result.toString();
    }
}
