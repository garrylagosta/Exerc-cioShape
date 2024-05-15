class Hexagono extends Shape {
    private double lado;

    public Hexagono(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }

    @Override
    public double getPerimetro() {
        return 6 * lado;
    }
}