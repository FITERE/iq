package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String[][] rotate(String[][] array, int index) {
        String[][] result = new String[array.length][array[0].length];

        for (int i = 0; i < result.length; i++) {
            if (i == index) {
                for (int j = 0; j < result[i].length - 1; j++) {
                    result[i][j] = array[i][j + 1];
                }
                result[i][result[i].length - 1] = array[i][0];
            } else result[i] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {

        //начало
        Scanner in = new Scanner(System.in);
        Random rn = new Random();
        System.out.print("Вас зовут ");
        String name1 = in.next();
        String name = name1.substring(0, 1).toUpperCase() + name1.substring(1);
        System.out.println("Здраствуйте " + name + ", это программа, напрямую связанная с iq.");
        System.out.println("В ней есть два теста, 1 - тест на iq, 2 - увелечения своего iq.");
        System.out.print("Вы хотите: ");
        int choice, iq = 50;
        int newIq = 0;
        String transitionTo11 = "";
        String transitionTo21 = "";

        while (true) {
            choice = in.nextInt();
            if (choice > 2 || choice < 1) System.out.print("Пожалуйста, " + name + ", введите правильное значение: ");
            else break;
        }


        //1 тест
        if (choice == 1) {
            System.out.println("Хорошо, " + name + ", давай приступим к познанию вашего iq!(Всего вопросов 7 лёгких, 9 непростых и 5 сложных) ");
            System.out.println("Сейчас будут 5 лёкгих вопроса с ответами, выбери верный!");

            System.out.println("a1: Кто открыл Америку? ");
            System.out.println("1 - Колумб       2 - Веспучи ");
            System.out.println("3 - Беринг       4 - Ливингстон");
            if (in.nextInt() == 1) iq += 3;
            else iq -= 7;

            System.out.println("a2: Кто такой Альберт Эйнштейн?");
            System.out.println("1 - математик     2 - физик");
            System.out.println("3 - биолог        4 - историк");
            if (in.nextInt() == 2) iq += 3;
            else iq -= 7;

            System.out.println("a3: Какой закон выявил Исаак Ньютон?");
            System.out.println("1 - Закон сохранения импульса                2 - Закон Архимеда");
            System.out.println("3 - Закон сохранения и превращения энергии   4 - Закон всемирного тяготения");
            if (in.nextInt() == 4) iq += 3;
            else iq -= 7;

            System.out.println("a4: Кто создал переодическую систему химический элементов?");
            System.out.println("1 - Дальтон       2 - Полинг");
            System.out.println("3 - Менделеев     4 - Вернер");
            if (in.nextInt() == 3) iq += 3;
            else iq -= 7;

            System.out.println("a5: Где родился Пушкин?");
            System.out.println("1 - в Москве, в Пятигроске                  2 - в Москве, в Немецкой слободе ");
            System.out.println("3 - в Ясной Поляне, в Тульскай губернии     4 - в Константиново, в Рязанском уезде");
            if (in.nextInt() == 2) iq += 3;
            else iq -= 7;

            System.out.println("a6: Что появилось раньше: курица либо яйцо.");
            System.out.println("1 - яйцо           2 - курица");
            System.out.println("3 - одновременно   4 - не известно миру");
            if (in.nextInt() == 1) iq += 3;
            else iq -= 7;

            System.out.println("a7: Кем является Леонардо Да Винчи?");
            System.out.println("1 - географ      2 - изобретатель");
            System.out.println("3 - физик        4 - историк");
            if (in.nextInt() == 2) iq += 3;
            else iq -= 7;


            System.out.println("А сейчас, " + name + ", будет 9 непростых вопроса на логику, где ты должен будешь вписывать ответ. (Вписывай только числа!)");

            System.out.println("b1: На столе лежат две монеты, в сумме они дают 3 рубля. Одна из них — не 1 рубль. Какие это монеты?");
            int b2 = in.nextInt(), b1 = in.nextInt();
            if (b2 == 2 || b2 == 1 && b1 == 1 || b1 == 2) iq += 5;
            else iq -= 4;

            System.out.println("b2: На сколько метров нужно бросить яйцо, что бы оно пролетело ровно 3 метра неразбившись?");
            if (in.nextInt() == 4) iq += 5;
            else iq -= 4;

            System.out.println("b3: В комнате горело 50 свечей, 20 из них задули. Сколько свечей останутся целыми через время?");
            if (in.nextInt() == 20) iq += 5;
            else iq -= 4;

            System.out.println("b4: Мальчик зашел в хлев и увидел там пять коров, три свиньи, две лошади и одну кошку. Сколько всего ног в хлеву? ");
            if (in.nextInt() == 2) iq += 5;
            else iq -= 4;

            System.out.println("b5: Сколько груш можно съесть натощак? ");
            if (in.nextInt() == 1) iq += 5;
            else iq -= 4;

            System.out.println("b6: Шли муж с женой, брат с сестрой да муж с шурином. Сколько всего человек?");
            if (in.nextInt() == 3) iq += 5;
            else iq -= 4;

            System.out.println("b7: В каком числе цифр столько, сколько букв в его названии?");
            int b7 = in.nextInt();
            if (b7 == 100 || b7 == 1000000) iq += 5;
            else iq -= 4;

            System.out.println("b8: На дереве сидело 10 птиц. Пришел охотник и подстрелил одну птицу. Сколько птиц осталось на дереве?");
            if (in.nextInt() == 0) iq += 5;
            else iq -= 4;

            System.out.println("b9: 10 быков дают 15 литров молока. Сколько молока дают 20 быков?");
            if (in.nextInt() == 0) iq += 5;
            else iq -= 4;


            System.out.println("И наконец, " + name + ", последние 5 сложных вопроса, где ты должен вписывать только слова.(употребляй только 1 слово, в И.п. и в ед. ч.)");

            System.out.println("c1:Кто под проливным дождем не намочит волосы?");
            if (in.next().toLowerCase().equals("лысый")) iq += 7;
            else iq -= 3;

            System.out.println("c2: Кто ходит сидя?");
            if (in.next().toLowerCase().equals("шахматист")) iq += 7;
            else iq -= 3;

            System.out.println("c3: Они могут одновременно висеть, идти и отставать, стоять, ходить и спешить, лежать и врать. Что это?");
            if (in.next().toLowerCase().equals("часы")) iq += 7;
            else iq -= 3;

            System.out.println("c4: На подоконнике притаился чудо-зверь, у него и хвост и лапы и даже уши как у кошки, но сам зверек – не кошка. О ком идет речь?");
            if (in.next().toLowerCase().equals("кот")) iq += 7;
            else iq -= 3;


            System.out.println("c5: Какую болезнь нельзя подхватить на земле?(В И.п., не забывай!)");
            if (in.next().toLowerCase().equals("морская")) iq += 7;
            else iq -= 3;

            System.out.println();

            //итоги 1 теста
            String results1 = "";
            System.out.println("Поздравляю тебя с прохождением 1 теста!");
            System.out.println("Ну что, " + name + ", ты готов к результатам познания своего iq? Да?");
            while (true) {
                results1 = in.next();
                if (results1.toLowerCase().equals("да")) break;
                else if (results1.toLowerCase().equals("бог")) break;
                else System.out.println("Ответ принимается только, как да. Да?");
            }

            //бог
            if (results1.toLowerCase().equals("бог")) {
                String mercy = in.next();
                int god = in.nextInt();
                if (mercy.toLowerCase().equals("+")) iq += god;
                if (mercy.toLowerCase().equals("-")) iq -= god;
            }

            System.out.println("Ну и отлично, " + name + ", ваш iq - " + iq);
            System.out.println("Если вы, " + name + ", хотите посмотреть ответы и пояснения на вопросы, просто скажите да или нет.");
            while (true) {
                transitionTo11 = in.next();
                if (transitionTo11.toLowerCase().equals("да") || transitionTo11.toLowerCase().equals("нет")) break;
                else System.out.println(name + " Напишите пожалуйста верно, да или нет");
            }


            //тест 1.1 проверка
            String number;
            if (transitionTo11.toLowerCase().equals("да")) {
                System.out.println("Для того, что бы просмотреть ответ введи номер вопроса (на англиском), который стоит в начале, а чтобы выйти скажи хватит.");
                while (true) {
                    number = in.next();
                    if (number.toLowerCase().equals("a1"))
                        System.out.println("a1: ответ 1 - Колумб, 12 октября 1492 года Колумб в ходе экспидици достиг острова Сан-Сальвадор в Багамском архипелаге.");
                    else if (number.toLowerCase().equals("a2"))
                        System.out.println("a2: ответ 2 - физик,  физик-теоретик, один из основателей современной теоретической физики, лауреат Нобелевской премии по физике 1921 года.");
                    else if (number.toLowerCase().equals("a3"))
                        System.out.println("a3: ответ 4 - закон всемирного тяготения, Этот закон был открыт Ньютоном около 1666 года.");
                    else if (number.toLowerCase().equals("a4"))
                        System.out.println("a4: ответ 3 - Менделеев, В 1869 году Д. И. Менделеев открыл и создал периодическую систему химических элементов.");
                    else if (number.toLowerCase().equals("a5"))
                        System.out.println("a5: ответ 2 - в Москве, в Немецкой слободе, Пушкин 6 июня 1799 г. родился в Москве, в Немецкой слободе.");
                    else if (number.toLowerCase().equals("a6"))
                        System.out.println("a6: ответ 1 - яйцо, задолго до появления куриц яйца откладывались динозаврами.");
                    else if (number.toLowerCase().equals("a7"))
                        System.out.println("a7: ответ 2 - изобретатель, он изобрёл паршют, гидрокостюм, бронеавтомобиль и др.");
                    else if (number.toLowerCase().equals("b1"))
                        System.out.println("b1: ответ 2 и 1, одна лишь монета не 1 рубль, а вторая может быть 1 рубль.");
                    else if (number.toLowerCase().equals("b2"))
                        System.out.println("b2: ответ 4 , 3 метра пролетает, а на 4 разбивается.");
                    else if (number.toLowerCase().equals("b3"))
                        System.out.println("b3: ответ 20, 20 свечей потухла, что значит они не сгорят.");
                    else if (number.toLowerCase().equals("b4"))
                        System.out.println("b4: ответ 2, только у мальчика есть ноги, у животных лапы.");
                    else if (number.toLowerCase().equals("b5"))
                        System.out.println("b5: ответ 1, следующая груша будет уже не натощак.");
                    else if (number.toLowerCase().equals("b6"))
                        System.out.println("b6: ответ 3, жена, муж, брат - шурин.");
                    else if (number.toLowerCase().equals("b7"))
                        System.out.println("b7: ответ 100 или 1000000, 100 (с-т-о), 1000000 (м-и-л-л-и-о-н).");
                    else if (number.toLowerCase().equals("b8"))
                        System.out.println("b8: ответ 0, птицы испугаются выстрела и улетят.");
                    else if (number.toLowerCase().equals("b9")) System.out.println("b9: ответ 0, быки не дают молоко.");
                    else if (number.toLowerCase().equals("c1"))
                        System.out.println("c1: ответ лысый, у него нет волос.");
                    else if (number.toLowerCase().equals("c2"))
                        System.out.println("c2: ответ шахматист, он ходит фигурами, но сидит.");
                    else if (number.toLowerCase().equals("c3"))
                        System.out.println("c3: ответ часы, они умеют все действия указанные в вопросе.");
                    else if (number.toLowerCase().equals("c4"))
                        System.out.println("c4: ответ кот, кот и кошка разные звери (мальчик и девочка), поэтому исключение не работают, а дальше именно кот и описан.");
                    else if (number.toLowerCase().equals("c5"))
                        System.out.println("c5: ответ морскую, морскую болезнь можно получить только на воде, но не суше.");
                    else if (number.toLowerCase().equals("хватит")) break;
                    else System.out.println(name + " Введи, пожалуйста, правильно.");
                }
            }

            //преход из 1 теста во 2 тест
            System.out.println("А вы хотите перейти к увелечению своего iq?");
            while (true) {
                transitionTo11 = in.next();
                if (transitionTo11.toLowerCase().equals("да")) break;
                else if (transitionTo11.toLowerCase().equals("нет")) {
                    System.out.println("Ну хорошо, " + name + ", пока!");
                    break;
                } else System.out.println(name + " Напишите пожалуйста верно, да или нет");
            }
        }


        //2 тест
        String want = "";
        String no = "";
        int yourIq = 0;
        int newRandomIq = 0;
        if (choice == 2 || transitionTo11.toLowerCase().equals("да")) {
            System.out.println("Хорошо, " + name + ", давай приступим к увелечению вашего iq!(Здесь будет магия с увелечением вашего iq)");
            if (choice == 2) {
                System.out.print("Для того, что бы начать нужен твой (желательно из 1 теста) iq: ");
                yourIq = in.nextInt();
                if (yourIq < 31 && yourIq > 1)
                    System.out.println("Маловато, но это программа специально для того, что бы это исправить.");
            }

            if (transitionTo11.toLowerCase().equals("да")) {
                yourIq = iq;
                System.out.println("Для того, что бы начать нужен твой iq, а он равен - " + yourIq + ".(Резальтат взят из 1 теста)");
            }

            if (yourIq >= 250)
                System.out.println("Вот это гений нашёлся, как смешно, самый умный? Ну если так, то вам эта программа не нужна, прошайте!");

            if (yourIq < 15)
                System.out.println(name + ", к сожалению тут моя программа не поможет вам ни как, прощайте!");

            if (yourIq >= 175 && yourIq < 250)
                System.out.println(name + ", не-не у вас и так нормальный iq, вам эта программа не нужна, так что прощайте!");

            else if (yourIq >= 100 && yourIq < 175) {
                System.out.print("Стоп, " + name + ", и этого вам мало? ");
                while (true) {
                    no = in.next();
                    if (no.toLowerCase().equals("да")) break;
                    else if (no.toLowerCase().equals("нет")) {
                        System.out.println(name + ", тогда вам это не пригодится, прощайте!");
                        break;
                    } else System.out.print("так да или нет? ");
                }
            }
            int maxOnIq = 175 - yourIq;
            int minOnIq = 76 - yourIq;

            if (no.toLowerCase().equals("да") || yourIq < 175 && yourIq >= 15) {
                System.out.println("Ну, " + name + ", приступим!");
                System.out.print("На сколько бы вы хотели увеличить всой iq? На ");
                int onIq = in.nextInt();

                if (onIq <= 0) System.out.println(name + ", за ваши смешные моменты, прощайте.");

                if (onIq + yourIq <= 75 && onIq + yourIq >= 16) {
                    System.out.println(name + ", вы можете побольше себе взять, побалуйте себя. Хотите побольше?");
                    while (true) {
                        want = in.next();
                        if (want.toLowerCase().equals("да")) break;
                        else if (want.toLowerCase().equals("нет")) break;
                        else System.out.println("Так хочешь или не хочешь, да или нет?");
                    }
                }

                if (want.toLowerCase().equals("да")) {
                    System.out.println("Хорошо, какое новое значение ты себе хочешь, на которое увеличишь свой iq. ");
                    while (true) {
                        onIq = in.nextInt();
                        if (onIq + yourIq > 75 && onIq + yourIq <= 175) {
                            System.out.println("Ну вот, считайте это мой подарок для вас, " + name);
                            break;
                        }
                        if (onIq + yourIq > 175)
                            System.out.println("Так, " + name + ", не перебарщивайте! Максимум на " + maxOnIq + ".");
                        if (onIq + yourIq < 75) {
                            System.out.println("Ну если не хотите себя баловать, так что считайте это мой подарок.");
                            System.out.println("Он начинается от  " + minOnIq + ", можете больше, но максимум " + maxOnIq + "!");
                        }
                    }

                }

                if (onIq + yourIq > 175) {
                    System.out.println("Слишком много хочешь, зачем тебе так много, у тебя и так " + yourIq + ", а ты хочешь ещё! ");
                    System.out.println(name + ", нет, это перебор, давай уменьшай свои хотения.");
                    System.out.print("Теперь ты увеличишь свой iq на ");
                    while (true) {
                        onIq = in.nextInt();
                        if (onIq + yourIq <= 175 && onIq > 0) {
                            System.out.println("Ну вот, можно же не перебарщивать.");
                            break;
                        } else if (onIq + yourIq > 175 && onIq > 0)System.out.print(name + ", пожалуйста введи адекватное число, не больше " + maxOnIq + "! Например ты хочешь увелечить на ");
                        else if (onIq < 1) System.out.println("Так, но не надо тут таких чисел, минимум 1, вводи адекватно!");
                    }
                }

                if (onIq < 25 && onIq > 0) System.out.println("Ну конечно, не на много увеличите вы свой iq, но это ваш выбор.");
                if (want.toLowerCase().equals("нет")) System.out.println("Ну как хотите, сами виноваты.");
                System.out.println("Ты уже близко к итогам!");
                System.out.println("Ну что, " + name + ", ты готов к своим новым результатам iq? Да?");
                while (true) {
                    if (in.next().toLowerCase().equals("да")) break;
                    else System.out.println("Ответ принимается только, как да. Да?");
                }

                //доказательство
                System.out.println(name + ", Всё не так просто, для начал ты докажешь, что достоин увелечения iq, решив задачу.");
                System.out.print("Что больше: сумма всех цифр или их произведение? Естественно больше ");
                String moreLess = "";
                while (true) {
                    moreLess = in.next();
                    if (moreLess.toLowerCase().equals("сумма")) break;
                    if (moreLess.toLowerCase().equals("произведение")) break;
                    else System.out.println("Введи правильно сумма или произведение.");
                }

                //неверно и пояснение
                if (moreLess.toLowerCase().equals("произведение")) {
                    System.out.println("Это неправильный ответ и, к сожалению, ты не смог мне доказать, что достоин.");
                    System.out.println("Если хочешь ты хочешь посмотреть пояснение к ответу просто скажи.");
                    String clarification;
                    while (true) {
                        clarification = in.next();
                        if (clarification.toLowerCase().equals("да")) {
                            System.out.println("Ответ сумма, в произведение будет множитель ноль, а умножая ноль на число или число на ноль будет ноль.");
                            System.out.println("Ну ладно, " + name + ", прощай!");
                            break;
                        }
                        if (clarification.toLowerCase().equals("нет")) {
                            System.out.println("Ну хорошо, тогда прощай, " + name + "!");
                            break;
                        } else System.out.println("Введи правильно, да или нет.");
                    }
                }

                //итоги 2 теста
                newIq = yourIq + onIq;
                if (moreLess.toLowerCase().equals("сумма")) {
                    System.out.println("Это верно, " + name + ", я вас поздравляю! Вы доказали мне, что достойны!");

                    System.out.print("Ну что результат на счёт: ");
                    int check = in.nextInt();
                    int maxCheck = check;
                    if (check > 5 || check < 1) {
                        if (check > 5) System.out.println("Давай поменьше, ну там максимум 5, а то надоест ждать.");
                        if (check < 1) System.out.println("Давай побольше, а то не прикольно, максиму 5, а миниму 1.");
                        while (true) {
                            maxCheck = in.nextInt();
                            if (maxCheck <= 5 && maxCheck >= 1) {
                                System.out.println("Отлично, тогда магия насчёт " + maxCheck);
                                break;
                            } else System.out.print(name + ", ну максимум 5, минимум 1, давайте магия насчёт: ");
                        }
                    }
                    check = maxCheck;
                    for (int i = 1; i <= check; i++) System.out.println(i);
                    System.out.println("Ваш увеличенный iq - " + newIq + ", поздравляю!");

                    //переход из теста 2 в тест 2.1
                    System.out.println("Может быть ты хочешь еще увелечить свой iq?");
                    while (true) {
                        transitionTo21 = in.next();
                        if (transitionTo21.toLowerCase().equals("да")) break;
                        if (transitionTo21.toLowerCase().equals("нет")) {
                            System.out.println("Хорошо, " + name + ", надеюсь вы довольны своим увеличенным iq, я был рад помочь, удачи, прощайте!");
                            break;
                        } else System.out.println("Выражайтесь понятнее, да или нет.");
                    }
                }
            }


            //тест 2.1
            if (transitionTo21.toLowerCase().equals("да")) {
                String ifYes = "";
                String interesting = "";
                newRandomIq = newIq;
                System.out.println("Хорошо, " + name + ", сейчас будут уравнения и за правильный ответ будут начислятся новые iq.");
                System.out.println("Но это будет не бесконечно, всего 10 уравнений с ответами - целыми цифрами от 1 до 10 включительно.");
                System.out.println("Ну что, " + name + ", начнём?");
                while (true) {
                    ifYes = in.next();
                    if (ifYes.toLowerCase().equals("да")) break;
                    else if (ifYes.toLowerCase().equals("нет")) break;
                    else System.out.println("Так да или нет?");
                }

                if (ifYes.toLowerCase().equals("нет")) System.out.println(name+ ", но вы же согласились, я разочарован");

                if (ifYes.toLowerCase().equals("да")) {
                    String[][] questions = {
                            {"( 1 345 + 25 ) : 2 * 5 * 2  - 2 283 * 3 = ", "6x – 2x – 6 = 3x – 2x – 3. x = ", "-0,2x + 2,7 = 1,4 + 1,1x. x = "},  //1
                            {"(3x + 5)/(x – 1) = (2x + 18)/(2x – 2). x = ", "-5х - 3 = -13. x = ", "4x + 2 = 2x + 10 - 2x. x = "},        //2
                            {"7x + 3 = 30 − 2x. x = ", "5 − 2(x − 1) = 4 − x. x = ", "120 : y - 23 = 17. y ="},             //3
                            {"3(x − 2) = x + 2. x = ", "64 : x = 16. x = ", "55 - y * 10 = 15. y = "},             //4
                            {"-7 + 2x = -3x + 18. x = ", "5,4 − 1,5x = 0,3x − 3,6. x = ", "4x - 2x = 3 + 2 +5. x = "},           //5
                            {"5х - 11 = 2х + 7. x = ", "2x = 18 − x. x = ", "(y + 50) : 14 = 4. y = "},            //6
                            {"5z = 65 - 30. z = ", "2 (x + 5) = 24;", "100 : (18 + (82 - 10х) : 6) = 5. x ="},//7
                            {"6x - 2 = 4x + 12. x = ", "5 * (x - 5) = 15. x = ", "84 - 7у = 28. y = "},                //8
                            {"-36 - 20x + 7x = -11 - 16x + 2. x = ", "14х + х - 9х + 2 = 56. x = ", "3x - 17 = 10. x = "},                //9
                            {"12 + 0,8у = 26 - 0,6у. y = ", "5x - 23 = 27 + 2x - 2x. x = ", "(48 + k) ∙ 8 = 464. k = "}            //10
                    };

                    for (int i = 1; i < 11; i++) {
                        int index = rn.nextInt(10) + 1;
                        System.out.print(questions[index - 1][0]);
                        questions = rotate(questions, index - 1);

                        int answer = in.nextInt();
                        if (answer == index) {
                            newRandomIq += 5;
                        } else newRandomIq -= 5;
                    }

                    //итоги 2,1 теста
                    System.out.println("Ну, финал этой части программы уже здесь, поздравляю!");
                    System.out.print("Ваш увеличенный-увеличенный iq - " + newRandomIq + " ");
                    if (newRandomIq < newIq)
                        System.out.println("и, к сожалению, " + name + ", вы уменьшили свой iq, ну вот так.");
                    if (newRandomIq == newIq)
                        System.out.println("и, " + name + ", вы не изменили свой iq вовсе, но лучше чем понижение.");
                    if (newRandomIq > newIq)
                        System.out.println("и, " + name + ", я вас хочу похвалить, ведь вы смогли увеличить свой iq!");

                    if (choice == 1) {
                        System.out.println("Ты прошёл большой путь, " + name + ", и на этом мы прощаемся, всё программа закончена, был рад знакомству, пока!");
                        System.out.println("Да, кстати говоря, тебе интересно кто я?");
                        while (true){
                            interesting = in.next();
                            if (interesting.toLowerCase().equals("да")) break;
                            else if (interesting.toLowerCase().equals("нет")) {
                                System.out.println("Ну ладно, " + name +  ", тогда точно пока!");
                                break;
                            }
                            else System.out.println("Так интересно, да или нет?");
                        }
                    }

                    if (interesting.toLowerCase().equals("да")){

                        System.out.println("Я, как не странно, являюсь создателем этой программы, а зовут меня Володя.");
                        System.out.println("Мне, как создателю, интересна твоя оценка от 1 до 10 этого всего, что было.");
                        System.out.print("Твоя оценка - ");
                        int grade = 0;
                        while (true){
                            grade = in.nextInt();
                            if ( grade > 0 && grade < 11) break;
                            else System.out.println("Оценка от 1 до 10, введи верно пожалуйста.");
                        }
                        System.out.print("Спасибо за твою оценку, " + name + ", она мне пригодится, ");
                        if (grade != 10) System.out.println("ну теперь точно пока.");
                        if (grade == 10){
                            System.out.println("а да кстати мне приятно, что ты поставил максимальный бал, но хочу тебя придупридить.");
                            System.out.println("Этот тест и каждое увелечение не работает, ну теперь точно пока, "  + name + ".");
                        }
                    }

                    if (choice == 2) System.out.println( name + ", хоть это и конец программы, но вы можете пройти еще тест на iq, а так я был рад знакомству, прощайте");
                }
            }
        }
    }
}












