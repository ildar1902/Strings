public class Main {
    public static void main(String[] args) {

        System.out.println("        Строки");
        System.out.println();
        System.out.println("    Черновик");
        System.out.println();
        String phoneNumber = "+982 200 01-40";
        phoneNumber = phoneNumber.replace("-", "");
        phoneNumber = phoneNumber.replace(" ", "");
        phoneNumber = phoneNumber.replace("+", "");
        if (phoneNumber.length() == 10) {
            phoneNumber = '7' + phoneNumber;
        } else if (phoneNumber.length() > 11) {
            throw new RuntimeException("Номер телефона слишком длинный");
        } else if (phoneNumber.length() < 10) {
            throw new RuntimeException("Номер телефона слишком короткий");
        } else if (phoneNumber.length() == 11 && phoneNumber.charAt(0) != '7') {
            throw new RuntimeException("Неверный код страны");
        }
        System.out.println("phoneNumber = " + phoneNumber);
        String expectedPhoneNumber = "79822000140";
        if (phoneNumber.equals(expectedPhoneNumber)) {
            System.out.println("Успех!");
        } else {
            System.out.println("Неудача");
        }

    }
}