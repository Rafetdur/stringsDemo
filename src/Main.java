public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugun Hava cok Guzel.";
        System.out.println(mesaj);
        System.out.println("Eleman Sayisi: " + mesaj.length());
        System.out.println("5. ELeman" + mesaj.charAt(4));
        System.out.println(mesaj.concat("Yasasin!"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        System.out.println(mesaj.indexOf("uz"));
        System.out.println(mesaj.lastIndexOf("a"));
    }
}
