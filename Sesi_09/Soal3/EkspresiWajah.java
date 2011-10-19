public class EkspresiWajah{
	public String respons (){
		return ("Perhatikan Ekspresi Wajah Saya");
		}
	}
	class Gembira extends EkspresiWajah {
		public String respons () {
			return ("ha ha ha..");
		}
	}
	
	class Sedih extends EkspresiWajah {
		public String respons (){
			return ("hik hik nge ngeeee...");
		}
	}
	
	class Marah extends EkspresiWajah {
		public String respons (){
			return ("Hai Kurang Ajar...!!!");
		}
	}