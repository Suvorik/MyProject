package turlo.lesson6;

class ExceptionSize extends RuntimeException {
    ExceptionSize(String msg) {
        super("Размерность массива не соответствует\n" + " " + msg);
    }

}