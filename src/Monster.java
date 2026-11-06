
public class Monster {

    private String namn;
    protected int halsa;
    protected int maxHalsa;
    protected int attackPoang;

   
    public Monster(String namn, int halsa, int attackPoang) 
    {
        this.namn = namn;
        this.halsa = halsa;
        this.maxHalsa = halsa;
        this.attackPoang = attackPoang;
    }


    public String getNamn() 
    {
        return namn;
    }

    public int getHalsa() 
    {
        return halsa;
    }

    public int getAttackPoang()
    {
        return attackPoang;
    }

   
    public void attack()
    {
        System.out.println(namn + " attackerar och gör "+ attackPoang + " skada!");
    }

  
    public void taSkada(int skada) 
    {
        halsa = halsa - skada;

        if (halsa < 0) 
        {
            halsa = 0;
        }
    }
}


