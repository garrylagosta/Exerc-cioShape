class Losango extends Shape {
    private double lado;

    public Losango(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado * Math.sin(60);
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }
}