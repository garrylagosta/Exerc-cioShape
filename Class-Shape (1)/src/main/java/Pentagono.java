class Pentagono extends Shape {
    private double lado;

    public Pentagono(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return (0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) * lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 5 * lado;
    }
}