public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        int velocity= status.getVelocity();
        int alt = status.getAltitude();
        int fuel = status.getFuel();
        if (alt <= 100){
            if (alt == 1)
                burn = 100+velocity-1;
            else
                burn=100+(velocity-alt)+1;
        } else if (alt<=5500 && velocity > 100){
            burn=200;
        }else
            burn = 100;
        System.out.println(burn); /*hack!*/
        return burn;
    }

}
