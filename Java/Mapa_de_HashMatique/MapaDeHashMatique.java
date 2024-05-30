import java.util.HashMap;
import java.util.Set;
public class MapaDeHashMatique {
    public static void main(String[] args){
        HashMap<String,String> banda=new HashMap<String,String>();
        banda.put("Citizen Erased","Break me in, teach us to cheat And to lie, cover up What shouldn't be shared And the truth's unwinding Scraping away at my mind Please stop asking me to describe");
        banda.put("New born","Link it to the world, Link it to yourself, Stretch it like a birth squeeze, The love for what you hide, The bitterness inside, Is growing like the new born, When you've seen, seen, Too much too young, young, Soulless is everywhere");
        banda.put("Stockholm syndrome","I won't stand in your way, Let your hatred grow, And she'll scream, and she'll shout, and she'll pray, And she had a name, Yeah, she had a name");
        banda.put("Plug in baby","I've exposed your lies, baby, The underneath is no big surprise, Now it's time for changing, And cleansing everything, To forget your love");
        banda.put("Knights of Cydonia","No one's gonna take me alive, Time has come to make things right, You and I must fight for our rights, You and I must fight to survive");
        System.out.println(banda.get("Citizen Erased"));
        Set<String> titulo= banda.keySet();
        for(String i:titulo){
            System.out.println(i);
            System.out.println(banda.get(i));
        }
    }
}
