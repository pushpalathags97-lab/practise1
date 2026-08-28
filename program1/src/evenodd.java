class evenodd {
    public static void main(String[] args) {

        System.out.println("Even Numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }


}

