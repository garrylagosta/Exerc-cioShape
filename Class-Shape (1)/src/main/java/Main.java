public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo("Meu Retângulo", 5, 10);
        Circulo circulo = new Circulo("Meu Círculo", 7);
        Losango losango = new Losango("Meu Losango", 8);
        Hexagono hexagono = new Hexagono("Meu Hexágono", 6);
        Pentagono pentagono = new Pentagono("Meu Pentágono", 4);

        System.out.println(retangulo.getNome());
        System.out.println("Área: " + retangulo.getArea());
        System.out.println("Perímetro: " + retangulo.getPerimetro());
        System.out.println();

        System.out.println(circulo.getNome());
        System.out.println("Área: " + circulo.getArea());
        System.out.println("Perímetro: " + circulo.getPerimetro());
        System.out.println();

        System.out.println(losango.getNome());
        System.out.println("Área: " + losango.getArea());
        System.out.println("Perímetro: " + losango.getPerimetro());
        System.out.println();

        System.out.println(hexagono.getNome());
        System.out.println("Área: " + hexagono.getArea());
        System.out.println("Perímetro: " + hexagono.getPerimetro());
        System.out.println();

        System.out.println(pentagono.getNome());
        System.out.println("Área: " + pentagono.getArea());
        System.out.println("Perímetro: " + pentagono.getPerimetro());
    }
}