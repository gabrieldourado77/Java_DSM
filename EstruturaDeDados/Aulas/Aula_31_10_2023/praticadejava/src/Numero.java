public class Numero {

    public int fat(int x){
        int f = 1;

        for(int i = x; i >= 2; i--){
            f = f * i;
        }

        return f;
    }

    public int fatR(int x){
        if(x >= 2){
            return fatR(x - 1) * x;
        }

        return 1;
    }

    public int fatR2(int x){
        if(x < 2){
            return 1;
        }

        return fatR2(x - 1) * x;
    }

}
