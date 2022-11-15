package j32_Abstract.abstract02;

public class Isci extends Personel{//abs Personel parent classa extend->concrete child ısci class
    @Override
    public void maasHesapla() {//personel parent class tan ovvirrede edilen abs. class
        System.out.println("agam marabalara en cok yevmiye 499 gayme veriyoruz");

    }

    @Override
    public void maasBilgisi() {//personel parent class tan ovvirrede edilen abs. class
        System.out.println("Agam marabalar cay hariç gunde 8 saat  ");

    }
}
