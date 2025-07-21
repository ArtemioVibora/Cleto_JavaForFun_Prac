public class WalaLang {

    public static void main(String[] args) {
        typeNgTae tnt = typeNgTae.black;

        switch(tnt)
        {
            case puti:
                System.out.println("Putang ina pare, puti tae mo");
                break;
            case brown:
                System.out.println("Okay normie");
                break;
            case black:
                System.out.println("Pare, pumunta ka na sa hospital. please");
                break;
        }
    }


}

enum typeNgTae
{
    puti,
    brown,
    black
}
