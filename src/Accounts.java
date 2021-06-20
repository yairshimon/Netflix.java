public class Accounts {
    private String nameAccountOwner;
    private String password;
    //private Series[] series = new Series[Main.MAX_SERIES];
    private boolean [] seriesWatch = new boolean[Main.MAX_SERIES];
    //private  [] episodesWatch = new boolean[Main.MAX_SERIES];
    private String accountCreationDate;
    private String dateTerminationAccount;

    public boolean getSeriesWatch(int index) {
        return seriesWatch[index];
    }

    public void setSeriesWatch(int index) {
        this.seriesWatch[index] = true;
    }

    public String getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(String accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public String getDateTerminationAccount() {
        return dateTerminationAccount;
    }

    public void setDateTerminationAccount(String dateTerminationAccount) {
        this.dateTerminationAccount = dateTerminationAccount;
    }

  /*  public void addSeriesWatched(Series series) {
        for (int i = 0; i <= this.seriesWatch.length; i++) {
            if (this.seriesWatch[i] == null) {
                this.seriesWatch[i] = series;
                return;
            }

        }
    }
    public void printSeriesWatched() {
        for (int i = 0; i <= this.seriesWatch.length; i++) {
            if (this.seriesWatch[i] == null) {
                System.out.println(this.seriesWatch[i]);
            }
        }
    }

    public Accounts(String nameAccountOwner, String password, Series[] series, String accountCreationDate, String dateTerminationAccount) {
        this.nameAccountOwner = nameAccountOwner;
        this.password = password;
        for (int i = 0; i <= this.seriesWatch.length; i++) {
            this.seriesWatch[i].setNameOfSeries("null");
            this.seriesWatch[i].setSeveralEpisodes(0);
        }
        this.accountCreationDate = accountCreationDate;
        this.dateTerminationAccount = dateTerminationAccount;
    }
*/
    public Accounts(String nameAccountOwner, String password ) {
        this.nameAccountOwner = nameAccountOwner;
        this.password = password;
    //    for (int i = 0; i <= this.seriesWatch.length; i++) {
            //   this.seriesWatch[i].setNameOfSeries("null");
         //      this.seriesWatch[i].setSeveralEpisodes(0);
        //    }


    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameAccountOwner() {
        return nameAccountOwner;
    }

    public void setNameAccountOwner(String nameAccountOwner) {
        this.nameAccountOwner = nameAccountOwner;
    }
    public void addAccount(String nameNewAccountOwner,Accounts[] accounts) {
        for (int i =0; i < accounts.length; i++){
            if(accounts[i] == null){
                accounts[i].nameAccountOwner = nameNewAccountOwner;
            }

         }
        System.out.println("No more place for new account");
    }
    public void print(Accounts accounts[]) { System.out.println("Name of account owner " +this.nameAccountOwner + "his code " + this.password); }
}
