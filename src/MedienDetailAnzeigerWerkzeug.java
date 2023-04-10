import java.util.List;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2023
 */
class MedienDetailAnzeigerWerkzeug
{
    private MedienDetailAnzeigerUI _ui;

    /**
     * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
     */
    public MedienDetailAnzeigerWerkzeug()
    {
        _ui = new MedienDetailAnzeigerUI();
    }

    /**
     * Setzt die Liste der Medien deren Details angezeigt werden sollen.
     * 
     * @param medien Eine Liste von Medien.
     * 
     * @require (medien != null)
     */
    public void setMedien(List<Medium> medien)
    {
        assert medien != null : "Vorbedingung verletzt: (medien != null)";
        TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
        String message = "";
        
        for (Medium medium : medien)
        {
            message = message + medium.getFormatiertenString();
        }
        
        selectedMedienTextArea.setText(message);
    }

    /**
     * Setzt die Liste der Medien deren Details angezeigt werden sollen.
     * 
     * @param medien Eine Liste von Medien.
     * 
     * @require (medien != null)
     */
    /**
    public void setMedien(List<Medium> medien)
    {
        assert medien != null : "Vorbedingung verletzt: (medien != null)";
        TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
        String message = "";
        
        
        for (Medium medium : medien)
        {
            if (medium instanceof DVD)
            {
                DVD dvdMedium = (DVD)medium;
                message = message + "Regisseur: " + dvdMedium.getRegisseur() + "\n" + 
                        dvdMedium.getLaufzeit() + " min";
            }
            else if (medium instanceof CD)
            {
                CD cdMedium = (CD)medium;
                message = message + "Interpret: " + cdMedium.getInterpret() + "\n" + 
                        cdMedium.getSpiellaenge() + " min";
            }
            else if (medium instanceof Videospiel)
            {
                Videospiel videospielMedium = (Videospiel)medium;
                message = message + "System: " + videospielMedium.getSystem() + "\n";
                
            }
            message = message + "\n" + medium.getKommentar();      
        }
        
        selectedMedienTextArea.setText(message);
    }
    */
    
    /**
     * Gibt das Panel dieses Subwerkzeugs zurück.
     * 
     * @ensure result != null
     */
    public Pane getUIPane()
    {
        return _ui.getUIPane();
    }
}
