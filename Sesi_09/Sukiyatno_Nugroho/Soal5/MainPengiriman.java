import javax.swing.JOptionPane;

public class MainPengiriman extends Paket{
	public MainPengiriman() {
	}
	
	public static void main (String args []) {
		MainPengiriman elie = new MainPengiriman ();
		
		String nmPengirim = JOptionPane.showInputDialog("Biaya Pengiriman Paket" + "\n Inputkan Nama Pengirim ");
		
		elie.setNmPengirim(nmPengirim);
		
		String tujuanPaket = JOptionPane.showInputDialog("Biaya Pengiriman Paket" + "\n Inputkan Tujuan Paket: Bali | Surabaya | Jakarta | Bandung");
		
		elie.setTujuanPaket(tujuanPaket);
		
		String br = JOptionPane.showInputDialog("Biaya Pengiriman Paket" + "\n Inputkan Berat Paket : ");
		
		int beratPaket = Integer.parseInt(br);
		elie.setBeratPaket (beratPaket);
		elie.biayaPerKg();
		elie.Bayar();
		
		JOptionPane.showMessageDialog(null,"Biaya Pengiriman Paket Adalah" + "\n Nama Pengirim : " + elie.getNmPengirim() + "\n Tujuan paket : "+ elie.getTujuanPaket() + "\n Berat Paket : " + elie.getBeratPaket() + "Kg" + "\n Biaya Per Kg:" +elie.biayaPerKg() + "\n Total Bayar : " + elie.Bayar() + "\nTerimakasih.......^_^ ");
		}
	}