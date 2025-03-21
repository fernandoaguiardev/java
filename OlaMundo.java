public class OlaMundo {
    // Atributos
    String msg = "Olá, mundo";

    // Método construtor (opcional)
    public OlaMundo() {
        // Você pode inicializar os atributos aqui, se necessário.
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void imprimirOlaMundo() {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        // Criando o objeto
        OlaMundo olaMundo = new OlaMundo();
        olaMundo.imprimirOlaMundo();

    }

}
