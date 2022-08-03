package test;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class RCB_TeamVerification {


@Test(priority=1, enabled=true)
public void validateForeignPlayersCount_RCB() throws FileNotFoundException, IOException, ParseException
{
JSONParser jsonParcer= new JSONParser();
JSONObject jsonobject= (JSONObject) jsonParcer.parse(new FileReader(".\\Resources\\TeamRCB.json"));
JSONArray  jsonarray= (JSONArray) jsonobject.get("player");

int countofForeignPlayers = 0;
for(int i=0; i<jsonarray.size(); i++){
JSONObject jsonobj= (JSONObject) jsonarray.get(i);
String role=(String) jsonobj.get("role");
String country=(String) jsonobj.get("country");

if(!country.equals("India")){
String NameOfForeignPlayers=((String) jsonobj. get("name"));
System.out.println(NameOfForeignPlayers);
countofForeignPlayers++;
}
}
assertEquals(countofForeignPlayers, 4, "Foreign Players count is more than 4");
System.out.println("count of Foreign Players of RCB player list:"+countofForeignPlayers);
}

@Test(priority=2, enabled=true)
public void validateWicketkeeperCount_RCB() throws FileNotFoundException, IOException, ParseException{
JSONParser jsonParcer= new JSONParser();
JSONObject jsonobject= (JSONObject) jsonParcer.parse(new FileReader(".\\Resources\\TeamRCB.json"));
JSONArray  jsonarray= (JSONArray) jsonobject.get("player");

int countOfWicketKeeper = 0;
for(int i=0; i<jsonarray.size(); i++){
JSONObject jsonobj= (JSONObject) jsonarray.get(i);
String role=(String) jsonobj.get("role");
if(role.equals("Wicket-keeper")){
String WicketKeeper=((String) jsonobj. get("name"));
System.out.println(WicketKeeper);
countOfWicketKeeper++;
}

}
Assert.isTrue(countOfWicketKeeper>0,"Wicket Keeper count is 0");
System.out.println("count of wicket keeper of RCB player list:"+countOfWicketKeeper);
}
}