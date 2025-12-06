package logica;

public class Pregunta {

    private String tipo;
    private String pregunta;
    private char respuestaCorrecta;
    private char respuestaUsuario;

    public Pregunta(String tipo, String pregunta, char respuestaCorrecta) {
        this.tipo = tipo;
        this.pregunta = pregunta;
        this.respuestaCorrecta = Character.toLowerCase(respuestaCorrecta);
    }

    public String getTipo() {
        return tipo;
    }

    public String getPregunta() {
        return pregunta;
    }

    public char getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public char getRespuestaUsuario() {
        return respuestaUsuario;
    }

    public void setRespuestaUsuario(char r) {
        this.respuestaUsuario = Character.toLowerCase(r);
    }

    public boolean esCorrecta() {
        return respuestaUsuario == respuestaCorrecta;
    }
}
