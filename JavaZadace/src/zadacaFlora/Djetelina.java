package zadacaFlora;

public class Djetelina extends Cvijet {

		private String bojaCvijeta; //Unijeti boju u formatu #FFFFFF
		private String brojListova;
		
		public String getBojaLatica() {
			return bojaCvijeta;
		}
		public void setBojaLatica(String bojaCvijeta) {
			this.bojaCvijeta = bojaCvijeta;
		}
		public String getBrojListova() {
			return brojListova;
		}
		public void setBrojListova(String brojListova) {
			this.brojListova = brojListova;
		}
		
}
