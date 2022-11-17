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
        //ДЗ.
        System.out.println();
        System.out.println("        ДЗ");
        System.out.println();

        //Задание 1
        System.out.println("    Задание 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

//        Задание 2.
        System.out.println();
        System.out.println("    Задание 2");
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - " + fullNameUp);

    }
}