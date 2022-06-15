public class MonsterChar {

	private String type;
	private int hp;
	private int str;
	private int con;
	private int dex;

	public MonsterChar(String type, int hp, int str, int con, int dex) {
		this.type = type;
		this.hp = hp;
		this.str = str;
		this.con = con;
		this.dex = dex;
	}

	public String getMonType() {
		return this.type;
	}

	public int getMonHp() {
		return this.hp;
	}

	public int getMonStr() {
		return this.str;
	}

	public int getMonCon() {
		return this.con;
	}

	public int getMondex() {
		return this.dex;
	}

	public void setMonType(String type) {
		this.type = type;
	}

	public void setMonHp(int hp) {
		this.hp = hp;
	}

	public void setMonStr(int str) {
		this.str = str;
	}

	public void setMonCon(int con) {
		this.con = con;
	}

	public void setMonDex(int dex) {
		this.dex = dex;
	}

}
