public class StringManipulations {
    public static void main(String[] args) {
        String str = "http://www.academiadecodigo.org";
        String domain = ""; // www.academiadecodigo.org
        String name = ""; // < Academia de Codigo_ >
        name = str.substring(11, 27);
        StringBuilder sb = new StringBuilder(name);
        sb.insert(0, "< ");
        sb.insert(sb.length(), "_ >");
        name = sb.toString();
        name=name.replaceFirst("academia","Academia ");
        name = name.replace("codigo", " Codigo");
        domain = str.substring(7);
        System.out.println("I am a Code at " + name + " " + domain);
    }
}
