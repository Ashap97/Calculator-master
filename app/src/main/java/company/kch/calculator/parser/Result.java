package company.kch.calculator.parser;



class Result {

    double acc; // Аккамулятор
    String rest; // остаток строки, которую мы еще не обработали

    Result(double v, String r) {
        this.acc = v;
        this.rest = r;
    }

}
