public class Main {
    public static void main(String[] args){
        System.out.println("������� ����������");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("��������� ����������");
        phonebook.add("������", "223344");
        phonebook.add("������", "22334411");
        phonebook.add("������", "22334499");
        phonebook.add("�������", "22334488");
        phonebook.add("������", "22334422");
        System.out.println("-----------------");

        System.out.println("�������� ������");
        System.out.println("������");
        System.out.println(phonebook.get("������"));
        System.out.println("������");
        System.out.println(phonebook.get("������"));
        System.out.println("�������");
        System.out.println(phonebook.get("�������"));
        System.out.println("-----------------");

        System.out.println("������ ���������� ������");
        System.out.println("��������");
        System.out.println(phonebook.get("��������"));
        System.out.println("-----------------");

        System.out.println("������� �������� ������������ �����");
        phonebook.add("������", "223344");
        System.out.println("������");
        System.out.println(phonebook.get("������"));
    }
}
