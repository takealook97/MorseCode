public class Translator {
    String getText2Morse(String[] input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length; i++) {//문장
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < input[i].length(); j++) {//단어
                switch (input[i].charAt(j)) {
                    case 'a', 'A' -> sb.append(MorseConstant.A);
                    case 'b', 'B' -> sb.append(MorseConstant.B);
                    case 'c', 'C' -> sb.append(MorseConstant.C);
                    case 'd', 'D' -> sb.append(MorseConstant.D);
                    case 'e', 'E' -> sb.append(MorseConstant.E);
                    case 'f', 'F' -> sb.append(MorseConstant.F);
                    case 'g', 'G' -> sb.append(MorseConstant.G);
                    case 'h', 'H' -> sb.append(MorseConstant.H);
                    case 'i', 'I' -> sb.append(MorseConstant.I);
                    case 'j', 'J' -> sb.append(MorseConstant.J);
                    case 'k', 'K' -> sb.append(MorseConstant.K);
                    case 'l', 'L' -> sb.append(MorseConstant.L);
                    case 'm', 'M' -> sb.append(MorseConstant.M);
                    case 'n', 'N' -> sb.append(MorseConstant.N);
                    case 'o', 'O' -> sb.append(MorseConstant.O);
                    case 'p', 'P' -> sb.append(MorseConstant.P);
                    case 'q', 'Q' -> sb.append(MorseConstant.Q);
                    case 'r', 'R' -> sb.append(MorseConstant.R);
                    case 's', 'S' -> sb.append(MorseConstant.S);
                    case 't', 'T' -> sb.append(MorseConstant.T);
                    case 'u', 'U' -> sb.append(MorseConstant.U);
                    case 'v', 'V' -> sb.append(MorseConstant.V);
                    case 'w', 'W' -> sb.append(MorseConstant.W);
                    case 'x', 'X' -> sb.append(MorseConstant.X);
                    case 'y', 'Y' -> sb.append(MorseConstant.Y);
                    case 'z', 'Z' -> sb.append(MorseConstant.Z);
                    case '0' -> sb.append(MorseConstant.ZERO);
                    case '1' -> sb.append(MorseConstant.ONE);
                    case '2' -> sb.append(MorseConstant.TWO);
                    case '3' -> sb.append(MorseConstant.THREE);
                    case '4' -> sb.append(MorseConstant.FOUR);
                    case '5' -> sb.append(MorseConstant.FIVE);
                    case '6' -> sb.append(MorseConstant.SIX);
                    case '7' -> sb.append(MorseConstant.SEVEN);
                    case '8' -> sb.append(MorseConstant.EIGHT);
                    case '9' -> sb.append(MorseConstant.NINE);
                }
                sb.append(" ");
            }
            result.append(sb);
        }
        return result.toString();
    }

    String getMorse2Text(String[] input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
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
            }
        }
        return result.toString();
    }
}
