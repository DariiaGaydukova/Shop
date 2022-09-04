import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> productList = new LinkedList<>();


        while (true) {

            System.out.println("�������� ��������:\n 1.��������\n 2.��������\n 3.�������\n 4.�����");
            String input = scanner.nextLine();
            int operation = Integer.parseInt(input);
            int productCount = 0;

            switch (operation) {

                case 1:
                    System.out.println("����� ������� �� ������ ��������?");
                    String product = scanner.nextLine();
                    productList.add(product);
                    productCount++;
                    System.out.println("����� � �������: " + productCount + " �������");
                    break;

                case 3:
                    System.out.println("����� ������� �� ������ �������? (������ ����� ��� ��������)");
                    String deleteProduct = scanner.nextLine();

                    try {
                        int delete = Integer.parseInt(deleteProduct);
                        productList.remove(delete);
                        System.out.println("������� " + deleteProduct + " �������, ������ �������:");
                    } catch (NumberFormatException e) {
                        productList.remove(deleteProduct);
                        System.out.println("������� " + deleteProduct + " �������, ������ �������:");
                    }


                case 2:

                    for (int i = 0; i < productList.size(); i++) {
                        System.out.println(i + 1 + "." + productList.get(i) + "\n");

                    }

                    break;


                case 4:
                    System.out.println("������� ����� ��� ������");
                    String query = scanner.nextLine();
                    String queryLower = query.toLowerCase();
                    for (int i = 0; i < productList.size(); i++) {
                        String item = productList.get(i);
                        String itemLower = item.toLowerCase();
                        if (itemLower.contains(queryLower)) {
                            System.out.println(i + 1 + "." + productList.get(i) + "\n");
                        }
                    }
            }
        }
    }
}