package com.wowlabz.component.utils;

public class HtmlEscape {
    private static char[] hex = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public HtmlEscape() {
    }

    public static String escapeTextArea(String original) {
        return escapeTags(escapeSpecial(original));
    }

    public static String escape(String original) {
        return escapeBr(escapeTags(escapeSpecial(original)));
    }

    public static String escapeTags(String original) {
        if(original == null) {
            return "";
        } else {
            StringBuffer out = new StringBuffer("");
            char[] chars = original.toCharArray();

            for(int i = 0; i < chars.length; ++i) {
                boolean found = true;
                switch(chars[i]) {
                    case '\"':
                        out.append("&quot;");
                        break;
                    case '<':
                        out.append("&lt;");
                        break;
                    case '>':
                        out.append("&gt;");
                        break;
                    default:
                        found = false;
                }

                if(!found) {
                    out.append(chars[i]);
                }
            }

            return out.toString();
        }
    }

    public static String escapeBr(String original) {
        if(original == null) {
            return "";
        } else {
            StringBuffer out = new StringBuffer("");
            char[] chars = original.toCharArray();

            for(int i = 0; i < chars.length; ++i) {
                boolean found = true;
                switch(chars[i]) {
                    case '\n':
                        out.append("<br/>");
                    case '\r':
                        break;
                    default:
                        found = false;
                }

                if(!found) {
                    out.append(chars[i]);
                }
            }

            return out.toString();
        }
    }

    public static String escapeSpecial(String original) {
        if(original == null) {
            return "";
        } else {
            StringBuffer out = new StringBuffer("");
            char[] chars = original.toCharArray();

            for(int i = 0; i < chars.length; ++i) {
                boolean found = true;
                switch(chars[i]) {
                    case '&':
                        out.append("&amp;");
                        break;
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '[':
                    case '\\':
                    case ']':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    case '{':
                    case '|':
                    case '}':
                    case '~':
                    case '\u007f':
                    case '\u0080':
                    case '\u0081':
                    case '\u0082':
                    case '\u0083':
                    case '\u0084':
                    case '\u0085':
                    case '\u0086':
                    case '\u0087':
                    case '\u0088':
                    case '\u0089':
                    case '\u008a':
                    case '\u008b':
                    case '\u008c':
                    case '\u008d':
                    case '\u008e':
                    case '\u008f':
                    case '\u0090':
                    case '\u0091':
                    case '\u0092':
                    case '\u0093':
                    case '\u0094':
                    case '\u0095':
                    case '\u0096':
                    case '\u0097':
                    case '\u0098':
                    case '\u0099':
                    case '\u009a':
                    case '\u009b':
                    case '\u009c':
                    case '\u009d':
                    case '\u009e':
                    case '\u009f':
                    case ' ':
                    case '¡':
                    case '£':
                    case '¤':
                    case '¥':
                    case '¦':
                    case '§':
                    case '¨':
                    case '©':
                    case 'ª':
                    case '«':
                    case '¬':
                    case '\u00ad':
                    case '®':
                    case '¯':
                    case '°':
                    case '±':
                    case '²':
                    case '³':
                    case '´':
                    case 'µ':
                    case '¶':
                    case '·':
                    case '¸':
                    case '¹':
                    case 'º':
                    case '»':
                    case '¼':
                    case '½':
                    case '¾':
                    case '¿':
                    case '×':
                    case '÷':
                    default:
                        found = false;
                        break;
                    case '¢':
                        out.append("&cent;");
                        break;
                    case 'À':
                        out.append("&Agrave;");
                        break;
                    case 'Á':
                        out.append("&Aacute;");
                        break;
                    case 'Â':
                        out.append("&Acirc;");
                        break;
                    case 'Ã':
                        out.append("&Atilde;");
                        break;
                    case 'Ä':
                        out.append("&Auml;");
                        break;
                    case 'Å':
                        out.append("&Aring;");
                        break;
                    case 'Æ':
                        out.append("&AElig;");
                        break;
                    case 'Ç':
                        out.append("&Ccedil;");
                        break;
                    case 'È':
                        out.append("&Egrave;");
                        break;
                    case 'É':
                        out.append("&Eacute;");
                        break;
                    case 'Ê':
                        out.append("&Ecirc;");
                        break;
                    case 'Ë':
                        out.append("&Euml;");
                        break;
                    case 'Ì':
                        out.append("&Igrave;");
                        break;
                    case 'Í':
                        out.append("&Iacute;");
                        break;
                    case 'Î':
                        out.append("&Icirc;");
                        break;
                    case 'Ï':
                        out.append("&Iuml;");
                        break;
                    case 'Ð':
                        out.append("&ETH;");
                        break;
                    case 'Ñ':
                        out.append("&Ntilde;");
                        break;
                    case 'Ò':
                        out.append("&Ograve;");
                        break;
                    case 'Ó':
                        out.append("&Oacute;");
                        break;
                    case 'Ô':
                        out.append("&Ocirc;");
                        break;
                    case 'Õ':
                        out.append("&Otilde;");
                        break;
                    case 'Ö':
                        out.append("&Ouml;");
                        break;
                    case 'Ø':
                        out.append("&Oslash;");
                        break;
                    case 'Ù':
                        out.append("&Ugrave;");
                        break;
                    case 'Ú':
                        out.append("&Uacute;");
                        break;
                    case 'Û':
                        out.append("&Ucirc;");
                        break;
                    case 'Ü':
                        out.append("&Uuml;");
                        break;
                    case 'Ý':
                        out.append("&Yacute;");
                        break;
                    case 'Þ':
                        out.append("&THORN;");
                        break;
                    case 'ß':
                        out.append("&szlig;");
                        break;
                    case 'à':
                        out.append("&agrave;");
                        break;
                    case 'á':
                        out.append("&aacute;");
                        break;
                    case 'â':
                        out.append("&acirc;");
                        break;
                    case 'ã':
                        out.append("&atilde;");
                        break;
                    case 'ä':
                        out.append("&auml;");
                        break;
                    case 'å':
                        out.append("&aring;");
                        break;
                    case 'æ':
                        out.append("&aelig;");
                        break;
                    case 'ç':
                        out.append("&ccedil;");
                        break;
                    case 'è':
                        out.append("&egrave;");
                        break;
                    case 'é':
                        out.append("&eacute;");
                        break;
                    case 'ê':
                        out.append("&ecirc;");
                        break;
                    case 'ë':
                        out.append("&euml;");
                        break;
                    case 'ì':
                        out.append("&igrave;");
                        break;
                    case 'í':
                        out.append("&iacute;");
                        break;
                    case 'î':
                        out.append("&icirc;");
                        break;
                    case 'ï':
                        out.append("&iuml;");
                        break;
                    case 'ð':
                        out.append("&eth;");
                        break;
                    case 'ñ':
                        out.append("&ntilde;");
                        break;
                    case 'ò':
                        out.append("&ograve;");
                        break;
                    case 'ó':
                        out.append("&oacute;");
                        break;
                    case 'ô':
                        out.append("&ocirc;");
                        break;
                    case 'õ':
                        out.append("&otilde;");
                        break;
                    case 'ö':
                        out.append("&ouml;");
                        break;
                    case 'ø':
                        out.append("&oslash;");
                        break;
                    case 'ù':
                        out.append("&ugrave;");
                        break;
                    case 'ú':
                        out.append("&uacute;");
                        break;
                    case 'û':
                        out.append("&ucirc;");
                        break;
                    case 'ü':
                        out.append("&uuml;");
                        break;
                    case 'ý':
                        out.append("&yacute;");
                        break;
                    case 'þ':
                        out.append("&thorn;");
                        break;
                    case 'ÿ':
                        out.append("&yuml;");
                }

                if(!found) {
                    if(chars[i] > 127) {
                        char c = chars[i];
                        int a4 = c % 16;
                        c = (char)(c / 16);
                        int a3 = c % 16;
                        c = (char)(c / 16);
                        int a2 = c % 16;
                        c = (char)(c / 16);
                        int a1 = c % 16;
                        out.append("&#x" + hex[a1] + hex[a2] + hex[a3] + hex[a4] + ";");
                    } else {
                        out.append(chars[i]);
                    }
                }
            }

            return out.toString();
        }
    }
}