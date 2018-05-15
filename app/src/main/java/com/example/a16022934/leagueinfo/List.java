package com.example.a16022934.leagueinfo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class List extends AppCompatActivity {
    int[] aatrox = {R.drawable.aatroxpassive, R.drawable.aatroxq, R.drawable.aatroxw, R.drawable.aatroxe, R.drawable.aatroxr};
    int[] ahri = {R.drawable.ahripassive, R.drawable.ahriq, R.drawable.ahriw, R.drawable.ahrie, R.drawable.ahrir};
    int[] akali = {R.drawable.akalipassive, R.drawable.akaliq, R.drawable.akaliw, R.drawable.akalie, R.drawable.akalir};
    int[] alistar = {R.drawable.alistarpassive, R.drawable.alistarq, R.drawable.alistarw, R.drawable.alistare, R.drawable.alistarr};
    int[] amumu = {R.drawable.amumupassive, R.drawable.amumuq, R.drawable.amumuw, R.drawable.amumue, R.drawable.amumur};
    int[] anivia = {R.drawable.aniviapassive, R.drawable.aniviaq, R.drawable.aniviaw, R.drawable.aniviae, R.drawable.aniviar};
    int[] annie = {R.drawable.anniepassive, R.drawable.annieq, R.drawable.anniew, R.drawable.anniee, R.drawable.annier};
    int[] ashe = {R.drawable.ashepassive, R.drawable.asheq, R.drawable.ashew, R.drawable.ashee, R.drawable.asher};
    int[] aurelionsol = {R.drawable.aurelionsolpassive, R.drawable.aurelionsolq, R.drawable.aurelionsolw, R.drawable.aurelionsole, R.drawable.aurelionsolr};
    int[] azir = {R.drawable.azirpassive, R.drawable.azirq, R.drawable.azirw, R.drawable.azire, R.drawable.azirr};
    int[] bard = {R.drawable.bardpassive, R.drawable.bardq, R.drawable.bardw, R.drawable.barde, R.drawable.bardr};
    int[] blitzcrank = {R.drawable.blitzcrankpassive, R.drawable.blitzcrankq, R.drawable.blitzcrankw, R.drawable.blitzcranke, R.drawable.blitzcrankr};
    int[] brand = {R.drawable.brandpassive, R.drawable.brandq, R.drawable.brandw, R.drawable.brande, R.drawable.brandr};
    int[] braum = {R.drawable.braumpassive, R.drawable.braumq, R.drawable.braumw, R.drawable.braume, R.drawable.braumr};
    int[] caitlyn = {R.drawable.caitlynpassive, R.drawable.caitlynq, R.drawable.caitlynw, R.drawable.caitlyne, R.drawable.caitlynr};
    int[] camille = {R.drawable.camillepassive, R.drawable.camilleq, R.drawable.camillew, R.drawable.camillee, R.drawable.camiller};
    int[] cassiopeia = {R.drawable.cassiopeiapassive, R.drawable.cassiopeiaq, R.drawable.cassiopeiaw, R.drawable.cassiopeiae, R.drawable.cassiopeiar};
    int[] chogath = {R.drawable.chogathpassive, R.drawable.chogathq, R.drawable.chogathw, R.drawable.chogathe, R.drawable.chogathr};
    int[] corki = {R.drawable.corkipassive, R.drawable.corkiq, R.drawable.corkiw, R.drawable.corkie, R.drawable.corkir};
    int[] darius = {R.drawable.dariuspassive, R.drawable.dariusq, R.drawable.dariusw, R.drawable.dariuse, R.drawable.dariusr};
    int[] diana = {R.drawable.dianapassive, R.drawable.dianaq, R.drawable.dianaw, R.drawable.dianae, R.drawable.dianar};
    int[] drmundo = {R.drawable.drmundopassive, R.drawable.drmundoq, R.drawable.drmundow, R.drawable.drmundoe, R.drawable.drmundor};
    int[] draven = {R.drawable.dravenpassive, R.drawable.dravenq, R.drawable.dravenw, R.drawable.dravene, R.drawable.dravenr};
    int[] ekko = {R.drawable.ekkopassive, R.drawable.ekkoq, R.drawable.ekkow, R.drawable.ekkoe, R.drawable.ekkor};
    int[] elise = {R.drawable.elisepassive, R.drawable.eliseq, R.drawable.elisew, R.drawable.elisee, R.drawable.eliser};
    int[] evelynn = {R.drawable.evelynnpassive, R.drawable.evelynnq, R.drawable.evelynnw, R.drawable.evelynne, R.drawable.evelynnr};
    int[] ezreal = {R.drawable.ezrealpassive, R.drawable.ezrealq, R.drawable.ezrealw, R.drawable.ezreale, R.drawable.ezrealr};
    int[] fiddlesticks = {R.drawable.fiddlestickspassive, R.drawable.fiddlesticksq, R.drawable.fiddlesticksw, R.drawable.fiddlestickse, R.drawable.fiddlesticksr};
    int[] fiora = {R.drawable.fiorapassive, R.drawable.fioraq, R.drawable.fioraw, R.drawable.fiorae, R.drawable.fiorar};
    int[] fizz = {R.drawable.fizzpassive, R.drawable.fizzq, R.drawable.fizzw, R.drawable.fizze, R.drawable.fizzr};
    int[] galio = {R.drawable.galiopassive, R.drawable.galioq, R.drawable.galiow, R.drawable.galioe, R.drawable.galior};
    int[] gangplank = {R.drawable.gangplankpassive, R.drawable.gangplankq, R.drawable.gangplankw, R.drawable.gangplanke, R.drawable.gangplankr};
    int[] garen = {R.drawable.garenpassive, R.drawable.garenq, R.drawable.garenw, R.drawable.garene, R.drawable.garenr};
    int[] gnar = {R.drawable.gnarpassive, R.drawable.gnarq, R.drawable.gnarw, R.drawable.gnare, R.drawable.gnarr};
    int[] gragas = {R.drawable.gragaspassive, R.drawable.gragasq, R.drawable.gragasw, R.drawable.gragase, R.drawable.gragasr};
    int[] graves = {R.drawable.gravespassive, R.drawable.gravesq, R.drawable.gravesw, R.drawable.gravese, R.drawable.gravesr};
    int[] hecarim = {R.drawable.hecarimpassive, R.drawable.hecarimq, R.drawable.hecarimw, R.drawable.hecarime, R.drawable.hecarimr};
    int[] heimerdinger = {R.drawable.heimerdingerpassive, R.drawable.heimerdingerq, R.drawable.heimerdingerw, R.drawable.heimerdingere, R.drawable.heimerdingerr};
    int[] illaoi = {R.drawable.illaoipassive, R.drawable.illaoiq, R.drawable.illaoiw, R.drawable.illaoie, R.drawable.illaoir};
    int[] irelia = {R.drawable.ireliapassive, R.drawable.ireliaq, R.drawable.ireliaw, R.drawable.ireliae, R.drawable.ireliar};
    int[] ivern = {R.drawable.ivernpassive, R.drawable.ivernq, R.drawable.ivernw, R.drawable.iverne, R.drawable.ivernr};
    int[] janna = {R.drawable.jannapassive, R.drawable.jannaq, R.drawable.jannaw, R.drawable.jannae, R.drawable.jannar};
    int[] jarvaniv = {R.drawable.jarvanivpassive, R.drawable.jarvanivq, R.drawable.jarvanivw, R.drawable.jarvanive, R.drawable.jarvanivr};
    int[] jax = {R.drawable.jaxpassive, R.drawable.jaxq, R.drawable.jaxw, R.drawable.jaxe, R.drawable.jaxr};
    int[] jayce = {R.drawable.jaycepassive, R.drawable.jayceq, R.drawable.jaycew, R.drawable.jaycee, R.drawable.jaycer};
    int[] jhin = {R.drawable.jhinpassive, R.drawable.jhinq, R.drawable.jhinw, R.drawable.jhine, R.drawable.jhinr};
    int[] jinx = {R.drawable.jinxpassive, R.drawable.jinxq, R.drawable.jinxw, R.drawable.jinxe, R.drawable.jinxr};
    int[] kaisa = {R.drawable.kaisapassive, R.drawable.kaisaq, R.drawable.kaisaw, R.drawable.kaisae, R.drawable.kaisar};
    int[] kalista = {R.drawable.kalistapassive, R.drawable.kalistaq, R.drawable.kalistaw, R.drawable.kalistae, R.drawable.kalistar};
    int[] karma = {R.drawable.karmapassive, R.drawable.karmaq, R.drawable.karmaw, R.drawable.karmae, R.drawable.karmar};
    int[] karthus = {R.drawable.karthuspassive, R.drawable.karthusq, R.drawable.karthusw, R.drawable.karthuse, R.drawable.karthusr};
    int[] kassadin = {R.drawable.kassadinpassive, R.drawable.kassadinq, R.drawable.kassadinw, R.drawable.kassadine, R.drawable.kassadinr};
    int[] katarina = {R.drawable.katarinapassive, R.drawable.katarinaq, R.drawable.katarinaw, R.drawable.katarinae, R.drawable.katarinar};
    int[] kayle = {R.drawable.kaylepassive, R.drawable.kayleq, R.drawable.kaylew, R.drawable.kaylee, R.drawable.kayler};
    int[] kayn = {R.drawable.kaynpassive, R.drawable.kaynq, R.drawable.kaynw, R.drawable.kayne, R.drawable.kaynr};
    int[] kennen = {R.drawable.kennenpassive, R.drawable.kennenq, R.drawable.kennenw, R.drawable.kennene, R.drawable.kennenr};
    int[] khazix = {R.drawable.khazixpassive, R.drawable.khazixq, R.drawable.khazixw, R.drawable.khazixe, R.drawable.khazixr};
    int[] kindred = {R.drawable.kindredpassive, R.drawable.kindredq, R.drawable.kindredw, R.drawable.kindrede, R.drawable.kindredr};
    int[] kled = {R.drawable.kledpassive, R.drawable.kledq, R.drawable.kledw, R.drawable.klede, R.drawable.kledr};
    int[] kogmaw = {R.drawable.kogmawpassive, R.drawable.kogmawq, R.drawable.kogmaww, R.drawable.kogmawe, R.drawable.kogmawr};
    int[] leblanc = {R.drawable.leblancpassive, R.drawable.leblancq, R.drawable.leblancw, R.drawable.leblance, R.drawable.leblancr};
    int[] leesin = {R.drawable.leesinpassive, R.drawable.leesinq, R.drawable.leesinw, R.drawable.leesine, R.drawable.leesinr};
    int[] leona = {R.drawable.leonapassive, R.drawable.leonaq, R.drawable.leonaw, R.drawable.leonae, R.drawable.leonar};
    int[] lissandra = {R.drawable.lissandrapassive, R.drawable.lissandraq, R.drawable.lissandraw, R.drawable.lissandrae, R.drawable.lissandrar};
    int[] lucian = {R.drawable.lucianpassive, R.drawable.lucianq, R.drawable.lucianw, R.drawable.luciane, R.drawable.lucianr};
    int[] lulu = {R.drawable.lulupassive, R.drawable.luluq, R.drawable.luluw, R.drawable.lulue, R.drawable.lulur};
    int[] lux = {R.drawable.luxpassive, R.drawable.luxq, R.drawable.luxw, R.drawable.luxe, R.drawable.luxr};
    int[] malphite = {R.drawable.malphitepassive, R.drawable.malphiteq, R.drawable.malphitew, R.drawable.malphitee, R.drawable.malphiter};
    int[] malzahar = {R.drawable.malzaharpassive, R.drawable.malzaharq, R.drawable.malzaharw, R.drawable.malzahare, R.drawable.malzaharr};
    int[] maokai = {R.drawable.maokaipassive, R.drawable.maokaiq, R.drawable.maokaiw, R.drawable.maokaie, R.drawable.maokair};
    int[] masteryi = {R.drawable.masteryipassive, R.drawable.masteryiq, R.drawable.masteryiw, R.drawable.masteryie, R.drawable.masteryir};
    int[] missfortune = {R.drawable.missfortunepassive, R.drawable.missfortuneq, R.drawable.missfortunew, R.drawable.missfortunee, R.drawable.missfortuner};
    int[] mordekaiser = {R.drawable.mordekaiserpassive, R.drawable.mordekaiserq, R.drawable.mordekaiserw, R.drawable.mordekaisere, R.drawable.mordekaiserr};
    int[] morgana = {R.drawable.morganapassive, R.drawable.morganaq, R.drawable.morganaw, R.drawable.morganae, R.drawable.morganar};
    int[] nami = {R.drawable.namipassive, R.drawable.namiq, R.drawable.namiw, R.drawable.namie, R.drawable.namir};
    int[] nasus = {R.drawable.nasuspassive, R.drawable.nasusq, R.drawable.nasusw, R.drawable.nasuse, R.drawable.nasusr};
    int[] nautilus = {R.drawable.nautiluspassive, R.drawable.nautilusq, R.drawable.nautilusw, R.drawable.nautiluse, R.drawable.nautilusr};
    int[] nidalee = {R.drawable.nidaleepassive, R.drawable.nidaleeq, R.drawable.nidaleew, R.drawable.nidaleee, R.drawable.nidaleer};
    int[] nocturne = {R.drawable.nocturnepassive, R.drawable.nocturneq, R.drawable.nocturnew, R.drawable.nocturnee, R.drawable.nocturner};
    int[] nunu = {R.drawable.nunupassive, R.drawable.nunuq, R.drawable.nunuw, R.drawable.nunue, R.drawable.nunur};
    int[] olaf = {R.drawable.olafpassive, R.drawable.olafq, R.drawable.olafw, R.drawable.olafe, R.drawable.olafr};
    int[] orianna = {R.drawable.oriannapassive, R.drawable.oriannaq, R.drawable.oriannaw, R.drawable.oriannae, R.drawable.oriannar};
    int[] ornn = {R.drawable.ornnpassive, R.drawable.ornnq, R.drawable.ornnw, R.drawable.ornne, R.drawable.ornnr};
    int[] pantheon = {R.drawable.pantheonpassive, R.drawable.pantheonq, R.drawable.pantheonw, R.drawable.pantheone, R.drawable.pantheonr};
    int[] poppy = {R.drawable.poppypassive, R.drawable.poppyq, R.drawable.poppyw, R.drawable.poppye, R.drawable.poppyr};
    int[] quinn = {R.drawable.quinnpassive, R.drawable.quinnq, R.drawable.quinnw, R.drawable.quinne, R.drawable.quinnr};
    int[] rakan = {R.drawable.rakanpassive, R.drawable.rakanq, R.drawable.rakanw, R.drawable.rakane, R.drawable.rakanr};
    int[] rammus = {R.drawable.rammuspassive, R.drawable.rammusq, R.drawable.rammusw, R.drawable.rammuse, R.drawable.rammusr};
    int[] reksai = {R.drawable.reksaipassive, R.drawable.reksaiq, R.drawable.reksaiw, R.drawable.reksaie, R.drawable.reksair};
    int[] renekton = {R.drawable.renektonpassive, R.drawable.renektonq, R.drawable.renektonw, R.drawable.renektone, R.drawable.renektonr};
    int[] rengar = {R.drawable.rengarpassive, R.drawable.rengarq, R.drawable.rengarw, R.drawable.rengare, R.drawable.rengarr};
    int[] riven = {R.drawable.rivenpassive, R.drawable.rivenq, R.drawable.rivenw, R.drawable.rivene, R.drawable.rivenr};
    int[] rumble = {R.drawable.rumblepassive, R.drawable.rumbleq, R.drawable.rumblew, R.drawable.rumblee, R.drawable.rumbler};
    int[] ryze = {R.drawable.ryzepassive, R.drawable.ryzeq, R.drawable.ryzew, R.drawable.ryzee, R.drawable.ryzer};
    int[] sejuani = {R.drawable.sejuanipassive, R.drawable.sejuaniq, R.drawable.sejuaniw, R.drawable.sejuanie, R.drawable.sejuanir};
    int[] shaco = {R.drawable.shacopassive, R.drawable.shacoq, R.drawable.shacow, R.drawable.shacoe, R.drawable.shacor};
    int[] shen = {R.drawable.shenpassive, R.drawable.shenq, R.drawable.shenw, R.drawable.shene, R.drawable.shenr};
    int[] shyvana = {R.drawable.shyvanapassive, R.drawable.shyvanaq, R.drawable.shyvanaw, R.drawable.shyvanae, R.drawable.shyvanar};
    int[] singed = {R.drawable.singedpassive, R.drawable.singedq, R.drawable.singedw, R.drawable.singede, R.drawable.singedr};
    int[] sion = {R.drawable.sionpassive, R.drawable.sionq, R.drawable.sionw, R.drawable.sione, R.drawable.sionr};
    int[] sivir = {R.drawable.sivirpassive, R.drawable.sivirq, R.drawable.sivirw, R.drawable.sivire, R.drawable.sivirr};
    int[] skarner = {R.drawable.skarnerpassive, R.drawable.skarnerq, R.drawable.skarnerw, R.drawable.skarnere, R.drawable.skarnerr};
    int[] sona = {R.drawable.sonapassive, R.drawable.sonaq, R.drawable.sonaw, R.drawable.sonae, R.drawable.sonar};
    int[] soraka = {R.drawable.sorakapassive, R.drawable.sorakaq, R.drawable.sorakaw, R.drawable.sorakae, R.drawable.sorakar};
    int[] swain = {R.drawable.swainpassive, R.drawable.swainq, R.drawable.swainw, R.drawable.swaine, R.drawable.swainr};
    int[] syndra = {R.drawable.syndrapassive, R.drawable.syndraq, R.drawable.syndraw, R.drawable.syndrae, R.drawable.syndrar};
    int[] tahmkench = {R.drawable.tahmkenchpassive, R.drawable.tahmkenchq, R.drawable.tahmkenchw, R.drawable.tahmkenche, R.drawable.tahmkenchr};
    int[] taliyah = {R.drawable.taliyahpassive, R.drawable.taliyahq, R.drawable.taliyahw, R.drawable.taliyahe, R.drawable.taliyahr};
    int[] talon = {R.drawable.talonpassive, R.drawable.talonq, R.drawable.talonw, R.drawable.talone, R.drawable.talonr};
    int[] taric = {R.drawable.taricpassive, R.drawable.taricq, R.drawable.taricw, R.drawable.tarice, R.drawable.taricr};
    int[] teemo = {R.drawable.teemopassive, R.drawable.teemoq, R.drawable.teemow, R.drawable.teemoe, R.drawable.teemor};
    int[] thresh = {R.drawable.threshpassive, R.drawable.threshq, R.drawable.threshw, R.drawable.threshe, R.drawable.threshr};
    int[] tristana = {R.drawable.tristanapassive, R.drawable.tristanaq, R.drawable.tristanaw, R.drawable.tristanae, R.drawable.tristanar};
    int[] trundle = {R.drawable.trundlepassive, R.drawable.trundleq, R.drawable.trundlew, R.drawable.trundlee, R.drawable.trundler};
    int[] tryndamere = {R.drawable.tryndamerepassive, R.drawable.tryndamereq, R.drawable.tryndamerew, R.drawable.tryndameree, R.drawable.tryndamerer};
    int[] twistedfate = {R.drawable.twistedfatepassive, R.drawable.twistedfateq, R.drawable.twistedfatew, R.drawable.twistedfatee, R.drawable.twistedfater};
    int[] twitch = {R.drawable.twitchpassive, R.drawable.twitchq, R.drawable.twitchw, R.drawable.twitche, R.drawable.twitchr};
    int[] udyr = {R.drawable.udyrpassive, R.drawable.udyrq, R.drawable.udyrw, R.drawable.udyre, R.drawable.udyrr};
    int[] urgot = {R.drawable.urgotpassive, R.drawable.urgotq, R.drawable.urgotw, R.drawable.urgote, R.drawable.urgotr};
    int[] varus = {R.drawable.varuspassive, R.drawable.varusq, R.drawable.varusw, R.drawable.varuse, R.drawable.varusr};
    int[] vayne = {R.drawable.vaynepassive, R.drawable.vayneq, R.drawable.vaynew, R.drawable.vaynee, R.drawable.vayner};
    int[] veigar = {R.drawable.veigarpassive, R.drawable.veigarq, R.drawable.veigarw, R.drawable.veigare, R.drawable.veigarr};
    int[] velkoz = {R.drawable.velkozpassive, R.drawable.velkozq, R.drawable.velkozw, R.drawable.velkoze, R.drawable.velkozr};
    int[] vi = {R.drawable.vipassive, R.drawable.viq, R.drawable.viw, R.drawable.vie, R.drawable.vir};
    int[] viktor = {R.drawable.viktorpassive, R.drawable.viktorq, R.drawable.viktorw, R.drawable.viktore, R.drawable.viktorr};
    int[] vladimir = {R.drawable.vladimirpassive, R.drawable.vladimirq, R.drawable.vladimirw, R.drawable.vladimire, R.drawable.vladimirr};
    int[] volibear = {R.drawable.volibearpassive, R.drawable.volibearq, R.drawable.volibearw, R.drawable.volibeare, R.drawable.volibearr};
    int[] warwick = {R.drawable.warwickpassive, R.drawable.warwickq, R.drawable.warwickw, R.drawable.warwicke, R.drawable.warwickr};
    int[] wukong = {R.drawable.wukongpassive, R.drawable.wukongq, R.drawable.wukongw, R.drawable.wukonge, R.drawable.wukongr};
    int[] xayah = {R.drawable.xayahpassive, R.drawable.xayahq, R.drawable.xayahw, R.drawable.xayahe, R.drawable.xayahr};
    int[] xerath = {R.drawable.xerathpassive, R.drawable.xerathq, R.drawable.xerathw, R.drawable.xerathe, R.drawable.xerathr};
    int[] xinzhao = {R.drawable.xinzhaopassive, R.drawable.xinzhaoq, R.drawable.xinzhaow, R.drawable.xinzhaoe, R.drawable.xinzhaor};
    int[] yasuo = {R.drawable.yasuopassive, R.drawable.yasuoq, R.drawable.yasuow, R.drawable.yasuoe, R.drawable.yasuor};
    int[] yorick = {R.drawable.yorickpassive, R.drawable.yorickq, R.drawable.yorickw, R.drawable.yoricke, R.drawable.yorickr};
    int[] zac = {R.drawable.zacpassive, R.drawable.zacq, R.drawable.zacw, R.drawable.zace, R.drawable.zacr};
    int[] zed = {R.drawable.zedpassive, R.drawable.zedq, R.drawable.zedw, R.drawable.zede, R.drawable.zedr};
    int[] ziggs = {R.drawable.ziggspassive, R.drawable.ziggsq, R.drawable.ziggsw, R.drawable.ziggse, R.drawable.ziggsr};
    int[] zilean = {R.drawable.zileanpassive, R.drawable.zileanq, R.drawable.zileanw, R.drawable.zileane, R.drawable.zileanr};
    int[] zoe = {R.drawable.zoepassive, R.drawable.zoeq, R.drawable.zoew, R.drawable.zoee, R.drawable.zoer};
    int[] zyra = {R.drawable.zyrapassive, R.drawable.zyraq, R.drawable.zyraw, R.drawable.zyrae, R.drawable.zyrar};
    ArrayList<int[]> skill = new ArrayList<>();
    ListView lv;
    ChampionBaseAdapter cAdapter;
    ArrayList<Champions> champion;
    ItemBaseAdapter iAdapter;
    ArrayList<Items> item;
    String listCreated = "";
    int fav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lv = findViewById(R.id.ListView);
        Intent intent = getIntent();
        String type = intent.getStringExtra("type");
        listCreated = type;
        if (type.equals("items")) {
            item = new ArrayList<>();
            String[] items = getResources().getStringArray(R.array.items);
            for (int i = 0; i < items.length; i++) {
                String clean = items[i].replace(" ", "").replace("-", "").replace("'", "").toLowerCase();
                String stat = clean + "Stat";
                String Cost = clean + "Cost";
                int itemStat = getArrayId(getApplicationContext(), stat);
                int itemPandA = getArrayId(getApplicationContext(), clean);
                int itemCost = getArrayId(getApplicationContext(), Cost);
                int itemImage = getResId(getApplicationContext(), clean);
                if (itemStat != 0 && itemPandA != 0 && itemCost != 0 && itemImage != 0) {
                    String[] itemStats = getResources().getStringArray(itemStat);
                    String[] itemPandAs = getResources().getStringArray(itemPandA);
                    int[] itemCosts = getResources().getIntArray(itemCost);

                    item.add(new Items(items[i], itemCosts[0], itemStats, itemPandAs, itemImage));
                    Log.d("HALP", itemImage + "");
                } else {
                    Log.v("Error", "Somethings WRONG its not HERE!" + clean);
                }
            }
            
            iAdapter = new ItemBaseAdapter(List.this, item);
            final EditText etSearch = findViewById(R.id.etSearch);

            lv.setAdapter(iAdapter);

            etSearch.addTextChangedListener(new TextWatcher() {
                @Override
                public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                    // When user changed the Text
                    List.this.iAdapter.getFilter().filter(cs);
                }

                @Override
                public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                }

                @Override
                public void afterTextChanged(Editable arg0) {
                }
            });

        } else {
            Toast.makeText(List.this, "Long hold to set Favourite", Toast.LENGTH_LONG);
            //a
            skill.add(aatrox);
            skill.add(ahri);
            skill.add(akali);
            skill.add(alistar);
            skill.add(amumu);
            skill.add(anivia);
            skill.add(annie);
            skill.add(ashe);
            skill.add(aurelionsol);
            skill.add(azir);
            //b
            skill.add(bard);
            skill.add(blitzcrank);
            skill.add(brand);
            skill.add(braum);
            //c
            skill.add(caitlyn);
            skill.add(camille);
            skill.add(cassiopeia);
            skill.add(chogath);
            skill.add(corki);
            //d
            skill.add(darius);
            skill.add(diana);
            skill.add(drmundo);
            skill.add(draven);
            //e
            skill.add(ekko);
            skill.add(elise);
            skill.add(evelynn);
            skill.add(ezreal);
            //f
            skill.add(fiddlesticks);
            skill.add(fiora);
            skill.add(fizz);
            //g
            skill.add(galio);
            skill.add(gangplank);
            skill.add(garen);
            skill.add(gnar);
            skill.add(gragas);
            skill.add(graves);
            //h
            skill.add(hecarim);
            skill.add(heimerdinger);
            //i
            skill.add(illaoi);
            skill.add(irelia);
            skill.add(ivern);
            //j
            skill.add(janna);
            skill.add(jarvaniv);
            skill.add(jax);
            skill.add(jayce);
            skill.add(jhin);
            skill.add(jinx);
            //k
            skill.add(kaisa);
            skill.add(kalista);
            skill.add(karma);
            skill.add(karthus);
            skill.add(kassadin);
            skill.add(katarina);
            skill.add(kayle);
            skill.add(kayn);
            skill.add(kennen);
            skill.add(khazix);
            skill.add(kindred);
            skill.add(kled);
            skill.add(kogmaw);
            //l
            skill.add(leblanc);
            skill.add(leesin);
            skill.add(leona);
            skill.add(lissandra);
            skill.add(lucian);
            skill.add(lulu);
            skill.add(lux);
            //m
            skill.add(malphite);
            skill.add(malzahar);
            skill.add(maokai);
            skill.add(masteryi);
            skill.add(missfortune);
            skill.add(mordekaiser);
            skill.add(morgana);
            //n
            skill.add(nami);
            skill.add(nasus);
            skill.add(nautilus);
            skill.add(nidalee);
            skill.add(nocturne);
            skill.add(nunu);
            //o
            skill.add(olaf);
            skill.add(orianna);
            skill.add(ornn);
            //p
            skill.add(pantheon);
            skill.add(poppy);
            //q
            skill.add(quinn);
            //r
            skill.add(rakan);
            skill.add(rammus);
            skill.add(reksai);
            skill.add(renekton);
            skill.add(rengar);
            skill.add(riven);
            skill.add(rumble);
            skill.add(ryze);
            //s
            skill.add(sejuani);
            skill.add(shaco);
            skill.add(shen);
            skill.add(shyvana);
            skill.add(singed);
            skill.add(sion);
            skill.add(sivir);
            skill.add(skarner);
            skill.add(sona);
            skill.add(soraka);
            skill.add(swain);
            skill.add(syndra);
            //t
            skill.add(tahmkench);
            skill.add(taliyah);
            skill.add(talon);
            skill.add(taric);
            skill.add(teemo);
            skill.add(thresh);
            skill.add(tristana);
            skill.add(trundle);
            skill.add(tryndamere);
            skill.add(twistedfate);
            skill.add(twitch);
            //u
            skill.add(udyr);
            skill.add(urgot);
            //v
            skill.add(varus);
            skill.add(vayne);
            skill.add(veigar);
            skill.add(velkoz);
            skill.add(vi);
            skill.add(viktor);
            skill.add(vladimir);
            skill.add(volibear);
            //w
            skill.add(warwick);
            skill.add(wukong);
            //x
            skill.add(xayah);
            skill.add(xerath);
            skill.add(xinzhao);
            //y
            skill.add(yasuo);
            skill.add(yorick);
            //z
            skill.add(zac);
            skill.add(zed);
            skill.add(ziggs);
            skill.add(zilean);
            skill.add(zoe);
            skill.add(zyra);
            champion = new ArrayList<>();
            String[] champions = getResources().getStringArray(R.array.champions);
            String[] secondName = getResources().getStringArray(R.array.secondName);
            for (int i = 0; i < champions.length; i++) {
                String clean = champions[i].replace(" ", "").replace("-", "").replace("'", "").replace(".", "").toLowerCase();
                Log.d("HELP", clean + "");
                int image = getResId(getApplicationContext(), clean);
                int skills = getArrayId(getApplicationContext(), clean);
                int role = getArrayId(getApplicationContext(), "champions_roles");
                fav = getArrayId(getApplicationContext(), "championsFavs");
                if (image != 0 && skills != 0 && fav != 0) {
                    String[] skillsDesc = getResources().getStringArray(skills);
                    String[] roles = getResources().getStringArray(role);
                    String[] favs = getResources().getStringArray(fav);
                    Boolean value = Boolean.valueOf(favs[i]);
                    champion.add(new Champions(champions[i], secondName[i], image, skill.get(i), skillsDesc, roles[i], value));
                }

            }
            cAdapter = new ChampionBaseAdapter(List.this, champion);
            final EditText etSearch = findViewById(R.id.etSearch);

            lv.setAdapter(cAdapter);

            etSearch.addTextChangedListener(new TextWatcher() {
                @Override
                public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                    // When user changed the Text
                    List.this.cAdapter.getFilter().filter(cs);
                }

                @Override
                public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                }

                @Override
                public void afterTextChanged(Editable arg0) {
                }
            });

        }

    }

    public int getArrayId(Context context, String name) {
        return context.getResources().getIdentifier(name, "array", context.getPackageName());
    }

    public int getResId(Context context, String name) {
        return context.getResources().getIdentifier(name, "drawable", context.getPackageName());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        if (listCreated.equals("items")) {
            MenuItem item = menu.findItem(R.id.top);
            item.setVisible(false);
            MenuItem item2 = menu.findItem(R.id.jg);
            item2.setVisible(false);
            MenuItem item3 = menu.findItem(R.id.mid);
            item3.setVisible(false);
            MenuItem item4 = menu.findItem(R.id.sp);
            item4.setVisible(false);
            MenuItem item5 = menu.findItem(R.id.adc);
            item5.setVisible(false);
            MenuItem item6 = menu.findItem(R.id.reset);
            item6.setVisible(false);

        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.top) {
            List.this.cAdapter.getRoles().filter("top");
        } else if (item.getItemId() == R.id.jg) {
            List.this.cAdapter.getRoles().filter("jungle");
        } else if (item.getItemId() == R.id.mid) {
            List.this.cAdapter.getRoles().filter("mid");
        } else if (item.getItemId() == R.id.sp) {
            List.this.cAdapter.getRoles().filter("support");
        } else if (item.getItemId() == R.id.adc) {
            List.this.cAdapter.getRoles().filter("adc");
        } else {
            List.this.cAdapter.getRoles().filter("");
        }
        return super.onOptionsItemSelected(item);
    }
}
