/**
 * Ein Videospiel ist ein Medium. Zusätzlich zu den Eigenschaften eines Mediums erfasst
 * sie Informationen zum System
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2023
 */
class Videospiel implements Medium
{


    /**
     * Die Plattform des Videospiels
     */
    private String _system;

    /**
     * Ein Kommentar zum Medium
     */
    private String _kommentar;

    /**
     * Der Titel des Mediums
     * 
     */
    private String _titel;

    /**
     * Initialisiert ein neues Exemplar.
     * 
     * @param titel Der Titel des Videospiels
     * @param kommentar Ein Kommentar zu der Videospiel
     * @param system Die plattform der Videospiel in Minuten
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
     */
    public Videospiel(String titel, String kommentar, String system)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert system != null : "Vorbedingung verletzt: plattform != null";
        _titel = titel;
        _kommentar = kommentar;
        _system = system;
    }


    @Override
    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }

    /**
     * Gibt die die Plattform des Videospiels zurück.
     * 
     * @return Die Plattform des Videospiels.
     * 
     * @ensure result != null
     */
    public String getPlattform()
    {
        return _system;
    }

    @Override
    public String getKommentar()
    {
        return _kommentar;
    }

    @Override
    public String getTitel()
    {
        return _titel;
    }

}
