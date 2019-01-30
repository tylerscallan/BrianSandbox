import com.google.gson.*;
import com.google.gson.GsonBuilder;
@SuppressWarnings("unused")


public class DivCard {
	private int id;
	private String cardName;
	private int cardStackSize;
	private String itemFromCard;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getCardName(){
		return cardName;
	}
	public void setCardName(String cardName){
		this.cardName = cardName;
	}
	public int getCardStackSize(){
		return cardStackSize;
	}
	public void setCardStackSize(int cardStackSize){
		this.cardStackSize = cardStackSize;
	}
	public String getItemFromCard(){
		return itemFromCard;
	}
	public  void setItemFromCard(String itemFromCard){
		this.itemFromCard = itemFromCard;
	}
}

