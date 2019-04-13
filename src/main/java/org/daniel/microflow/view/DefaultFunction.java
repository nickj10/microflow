package org.daniel.microflow.view;

public enum DefaultFunction {

    ENGLISH("char TiGetTimer (void);\n" +
            "//Pre: there are still available timers.\n" +
            "//Post: returns a 'Handle' to be able to use the functions TiGetTics() and TiResetTics().\n" +
            "//Retorns -1 if there are no available timers.\n\n" +

            "unsigned int TiGetTics (unsigned char Handle);\n" +
            "//Pre: 'Handle' was obtained from calling TiGetTimer.\n" +
            "//Post: returns the milliseconds that have passed since the last call to TiGetTics() for this 'handle'.\n\n" +

            "void TiResetTics (unsigned char Handle);\n" +
            "//Pre: 'Handle' was obtained from calling TiGetTimer.\n" +
            "//Post: turns on the timer associated for 'Handle' and takes the temporal reference of the system.\n\n",

            "int SiCharAvail(void);\n" +
                    "//Post: returns the number of available characters that are in the reception queue.\n" +
                    "//Retorna -1 if there are no available characters.\n\n" +

                    "char SiGetChar(void);\n" +
                    "//Pre: SiCharAvail() returns a number greater than zero.\n"+
                    "//Post: returns and removes the first element from the reception queue.\n\n" +

                    "void SiSendChar(char c);\n" +
                    "//Post: waits for the last character to be sent and then sends this one (c).\n\n",
            "int AdGetMostra(void);\n" +
                    "//Post: returns the analog sample converted to 10 bits.\n\n",
            "void func(void);\n//Pre: \n//Post: \n\n"),

    SPANISH("char TiGetTimer (void);\n" +
            "//Pre: hay algún timer libre.\n" +
            "//Post: retorna un 'Handle' para usar las funciones TiGetTics y TiResetTics.\n" +
            "//Retorna -1 si no hay ningún timer disponibles.\n\n" +

            "unsigned int TiGetTics (unsigned char Handle);\n" +
            "//Pre: 'Handle' fue retornado por TiGetTimer.\n" +
            "//Post: retorna los milisegundos que han transcurrido desde la última llamada a TiResetTics para este handle.\n\n" +

            "void TiResetTics (unsigned char Handle);\n" +
            "//Pre: 'Handle' fue retornado por TiGetTimer.\n" +
            "//Post: enciende la temporización asociada a 'Handle' y toma la referencia temporal del sistema.\n\n",

            "int SiCharAvail(void);\n" +
                    "//Post: retorna el número de caracteres disponibles que no se han sacado de la cola\n" +
                    "//Retorna -1 si no hay ningún caracter disponible.\n\n" +

                    "char SiGetChar(void);\n" +
                    "//Pre: SiCharAvail() retorna mayor que cero\n"+
                    "//Post: saca y retorna el primer caracter de la cola de recepción.\n\n" +

                    "void SiSendChar(char c);\n" +
                    "//Post: espera que el caracter anterior se acabe de finalizar y envia este.\n\n",
            "int AdGetMostra(void);\n" +
                    "//Post: retorna la muestra convertida en 10 bits\n\n",

            "void func(void);\n//Pre: \n//Post: \n\n"),

    CATALAN("char TiGetTimer (void);\n" +
            "//Pre: Hi ha algun timer lliure.\n" +
            "//Post: Retorna un handle per usar les funcions TiGetTics i TiResetTics.\n" +
            "//Retorna -1 si no hi ha cap timer disponible.\n\n" +

            "unsigned int TiGetTics (unsigned char Handle);\n" +
            "//Pre: Handle ha estat retornat per TiGetTimer.\n" +
            "//Post: Retorna els milisegons transcorreguts des de la crida a TiResetTics del Handle.\n\n" +

            "void TiResetTics (unsigned char Handle);\n" +
            "//Pre: Handle ha estat retornat per TiGetTimer.\n" +
            "//Post: Engega la temporització associada a 'Handle' i agafa la referencia temporal del sistema.\n\n",

            "int SiCharAvail(void);\n" +
                    "//Post: retorna el nombre de caràcters rebuts que no s'han recollit\n" +
                    "//Retorna -1 si no hi ha cap caracter disponible.\n\n" +

                    "char SiGetChar(void);\n" +
                    "//Pre: SiCharAvail() és major que zero\n"+
                    "//Post: Treu i retorna el primer caràcter de la cua de recepció.\n\n" +

                    "void SiSendChar(char c);\n" +
                    "//Post: espera que el caràcter anterior s'hagi enviat i envia aquest.\n\n",
            "int AdGetMostra(void);\n" +
                    "//Post: Retorna la mostra convertida en 10 bits\n\n",
            "void func(void);\n//Pre: \n//Post: \n\n");

    private String timerText;
    private String sioText;
    private String adcText;
    private String basicText;

    DefaultFunction(String timer, String sio, String adc, String basic) {
        timerText  = timer;
        sioText = sio;
        adcText = adc;
        basicText = basic;
    }

    public String getTimerText() {
        return timerText;
    }

    public String getSIOText() {
        return sioText;
    }

    public String getADCText() {
        return adcText;
    }

    public String getBasicText() {
        return basicText;
    }

    @Override
    public String toString() {
        return name().substring(0, 1) + name().substring(1).toLowerCase();
    }
}
