module es.liernisarraoa.dein_ejercicioq_lsj {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.liernisarraoa.dein_ejercicioq_lsj to javafx.fxml;
    exports es.liernisarraoa.dein_ejercicioq_lsj;
    exports es.liernisarraoa.dein_ejercicioq_lsj.Controlador;
    opens es.liernisarraoa.dein_ejercicioq_lsj.Controlador to javafx.fxml;
}