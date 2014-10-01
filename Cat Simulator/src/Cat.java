/**
 * Created by VioLeY on 18.09.2014.
 */
public class Cat {
    UserAction ua = new UserAction();
    Cat(){

    }
    public void WakeUp(){
        System.out.println("Котйка проснулся.");
        ImAlive();
    }
    public void ImAlive(){
        System.out.println("Он все еще жив?");
        if (ua.CheckAnswer())
            WantEat();
        else
            Die();
    }
    public void Die(){
        System.out.println("Не делайте так больше :( Жалко котика :'(");
        System.out.println("Может он все таки был жив?");
        if (ua.CheckAnswer()) WakeUp();
        else {
            System.out.println("Злые вы!");
        }
    }
    public void WantEat(){
        System.out.println("Хавать хочется?");
        if (ua.CheckAnswer())
            GoToKitchen();
        else
            WantSomePipi();
    }
    public void GoToKitchen(){
        System.out.println("Есть ли хавка в миске?");
        if(ua.CheckAnswer())
            CanIEatIt();
        else
            JumpOnTable();
    }
    public void CanIEatIt(){
        System.out.println("А эт съедобно?");
        if (ua.CheckAnswer()) EatWithPleasure();
        else MakeDisgustingThings("shoes");
    }
    public void EatWithPleasure(){
        System.out.println("Мммммм вкусняшка!");
        System.out.println("Я доволен.!");
        ImAlive();
    }
    public void JumpOnTable(){
        System.out.println("Таак, я на столе. Тут есть еда?");
        if(ua.CheckAnswer()) EatOnTable();
        else MakeDisgustingThings("shoes");
    }
    public void EatOnTable(){
        System.out.println("Мммм вкусно! Главное чтоб не заметили.");
        System.out.println("* Спалился? *");
        if(ua.CheckAnswer()) GetItOnTheNeck();//Получить по шее
        else GoOut();
    }
    public void GetItOnTheNeck(){
        System.out.println("Гады! Я обиделся... Но я отомщу... \n*Уходит*");
        MakeDisgustingThings("shoes");
    }
    public void MakeDisgustingThings(String where){
        if (where.equals("shoes"))
            System.out.println("Ммммм, кажется кто-то нагадил в тапки... кто бы это мог быть?");
        if (where.equals("flowers"))
            System.out.println("*Удобрил цеты*");
        if (where.equals("lotok"))
            System.out.println("*Грустный кот идет в  лоток.* \n * За(раз)грузка... *\n Дело сделано.");
        if (where.equals("kover"))
            System.out.println("Хехееее, вот вам и пятно на ковер! Ухахахахха \n *Королевской походкой уходит*\n* Тем же вечером получает по мордасам*");
        FeelSatusfied();
    }
    public void FeelSatusfied(){
        System.out.println("*Чувствует удовлетворение*");
        GoOut();
    }
    public void GoOut(){
        System.out.println("*Уходит в другую комнату*");
        WantEat();
    }
    public void WantSomePipi(){
        System.out.println("* Хочет ли котейка в туалет? *");
        if (ua.CheckAnswer())
            ShowsIsClear();
        else
            WantToPlay();
    }
    public void ShowsIsClear(){
        System.out.println("Давно ли мы портили тапки хрзина?");
        if (ua.CheckAnswer())
            MakeDisgustingThings("shoes");
        else
            WantPipiInGoodPlace();
    }
    public void WantPipiInGoodPlace(){
        System.out.println("Хочется ли идти к лотку?");
        if (ua.CheckAnswer())
            GoToLotok();
        else
            MaybeInFlowers();
    }
    public void MaybeInFlowers(){
        System.out.println("Может быть в цветы?");
        if (ua.CheckAnswer())
            MakeDisgustingThings("flowers");
        else
            GoToLotok();
    }
    public void GoToLotok(){
        System.out.println("Лоток чистый?");
        if (ua.CheckAnswer())
            MakeDisgustingThings("lotok");
        else
            Revenge();
    }
    public void Revenge(){
        System.out.println("Ах так!!! Ну щас я вам");
        MakeDisgustingThings("kover");
    }

    public void WantToPlay(){
        System.out.println("* Хочет ли котейка поиграть? *");
        if (ua.CheckAnswer())
            Toys();
        else
            GoToPeople();
    }
    public void Toys(){
        System.out.println("* А у кота игрушки есь? *");
        if (ua.CheckAnswer())
            PlayWithToys();
        else
            DigFlowers();
    }
    public void PlayWithToys(){
        System.out.println(" * Кот довольный гоняется за шариком *");
        GoToPeople();
    }
    public void DigFlowers(){
        System.out.println("Ну раз нету игрушек, как на счет выкопать цветы?");
        if (ua.CheckAnswer())
            YeeeeeeeeLetsDigThatsFlowers();
        else
            GoToPeople();
    }
    public void YeeeeeeeeLetsDigThatsFlowers(){
        System.out.println("* Усердно как таджик на подработке выкапывает цветы из горшков *");
        GoToPeople();
    }
    public void GoToPeople(){
        System.out.println("* Идет в комнату к хозяевам (хотя кто тут еще чей хояин, жалкие рабы уххахахахахаха) *");
        PeopleInRoom();
    }
    public void PeopleInRoom(){
        System.out.println("* А эти людишки вообще дома?  *");
        if (ua.CheckAnswer()) {
            System.out.println("* Котик пристраивается рядышком с хозяином *");
            DoWeLoveThem();
        }
        else
            GoSleep();
    }
    public void DoWeLoveThem(){
        System.out.println("* А котик любит хозяина? *");
        if (ua.CheckAnswer())
            Pourchat();
        else
            KickHim();
    }
    public void Pourchat(){
        System.out.println("* Урчит лежа на пузе *");
        DoManEnjoyIt();
    }
    public void KickHim(){
        System.out.println(" * Кусает хозяина за пятку *");
        DoManEnjoyIt();
    }
    public void DoManEnjoyIt(){
        System.out.println("* Хозяину понравилось? *");
        if (ua.CheckAnswer())
            PYZO();
        else
            MakeBadFace();
    }
    public void PYZO(){
        System.out.println("* Повернулся к нему пузом *");
        DoHeIronUs();
    }
    public void DoHeIronUs(){
        System.out.println("* Хозин гладит? *");
        if (ua.CheckAnswer())
            UsOrClothes();
        else
            MakeBadFace();
    }
    public void UsOrClothes(){
        System.out.println("* Гладит нас или белье? *");
        if (ua.CheckAnswer())
            EnjoyIroning();
        else
            MakeBadFace();
    }
    public void MakeBadFace(){
        System.out.println("* Корчит недовольную рожу *\n * Деностративно удалятся *");
        GoSleep();
    }
    public void EnjoyIroning(){
        System.out.println(" Уррррррр, приятно то как.... Ну же гладь меня везде, 18 мне уже...");
        GoSleep();
    }
    public void GoSleep(){
        System.out.println("* Котейка засыпает ...*");
    }


}



