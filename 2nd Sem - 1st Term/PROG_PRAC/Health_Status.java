enum Health_Status {
    STABLE, CRITICAL, RECOVERING;

    public static Health_Status stats(int num) {
        switch(num) {
            case 1:
                return STABLE;
            case 2:
                return CRITICAL;
            case 3:
                return RECOVERING;
            default:
                throw new IllegalArgumentException();       
        }
    }

}