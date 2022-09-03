Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        int divident = sc.nextInt();
        while (divisor % divident != 0) {
            int rem = divident % divisor;
            divisor = rem;
            divident = divisor;
        }
        int g = divident;
        int lh = divident * divisor;
        int l = lh / g;
        System.out.println(l);
