package MP2;

enum YearLevel {
    FRESHMAN, SOPHOMORE, JUNIOR, SENIOR, REGULAR, SCHOLAR;

    public static YearLevel y(int year) {
        switch (year) {
                case 1:
                    return FRESHMAN;                    
                case 2:
                    return SOPHOMORE;                    
                case 3:
                    return JUNIOR;                  
                case 4: 
                    return SENIOR;
                default:
                    throw new IllegalArgumentException();
            }
    }

}
