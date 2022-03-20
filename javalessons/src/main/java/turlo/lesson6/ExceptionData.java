package turlo.lesson6;

class ExceptionData extends RuntimeException {
    ExceptionData(String msg) {
        super("Элемент массива не является целым числом\n" + " " + msg);
    }

}
