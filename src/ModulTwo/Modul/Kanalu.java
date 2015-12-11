package ModulTwo.Modul;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 11.12.2015.
 */
public class Kanalu {

    private List<Programma> programs = new ArrayList<>();

    public Kanalu() {
        programs.add(new Programma("Снiданок                    ", "08.00", "10.00")
                .addCategory("ICTVm")
                .addCategory("ICTVtu")
                .addCategory("ICTVw")
                .addCategory("ICTVth")
                .addCategory("ICTVf")
        );
        programs.add(new Programma("Факти. Iнформацiйний випуск ", "10.00", "12.00")
                .addCategory("ICTVm").addCategory("ICTVtu")
                .addCategory("ICTVw")
                .addCategory("ICTVth")
                .addCategory("ICTVf")
        );
        programs.add(new Programma("Надзвичайнi новини          ", "12.00", "14.00")
                .addCategory("ICTVm")
                .addCategory("ICTVtu")
                .addCategory("ICTVw")
                .addCategory("ICTVth")
                .addCategory("ICTVf")
        );
        programs.add(new Programma("Громадянська оборона        ", "14.00", "16.00")
                .addCategory("ICTVm")
                .addCategory("ICTVtu")
                .addCategory("ICTVw")
                .addCategory("ICTVth")
                .addCategory("ICTVf")
        );
        programs.add(new Programma("Т/с Дальнобiйники           ", "16.00", "18.00")
                .addCategory("ICTVm")
                .addCategory("ICTVtu")
                .addCategory("ICTVw")
                .addCategory("ICTVth")
                .addCategory("ICTVf")
        );
        programs.add(new Programma("Факти. Iнформацiйний випуск ", "18.00", "20.00")
                .addCategory("ICTVm")
                .addCategory("ICTVtu")
                .addCategory("ICTVw")
                .addCategory("ICTVth")
                .addCategory("ICTVf")
        );
        programs.add(new Programma("Т/с Володимирська 15        ", "20.00", "22.30")
                .addCategory("ICTVm")
                .addCategory("ICTVtu")
                .addCategory("ICTVw")
                .addCategory("ICTVth")
                .addCategory("ICTVf")
        );
        programs.add(new Programma("Х/ф Обитель Зла             ", "22.30", "02.00").addCategory("ICTVm"));
        programs.add(new Programma("СТОП-10                     ", "02.00", "05.00")
                .addCategory("ICTVm")
        );
        programs.add(new Programma("Суддя Вашингтон             ", "05.00", "08.00")
                .addCategory("ICTVm")
        );

        programs.add(new Programma("Х/ф Дiвчина з тату дракона   ", "22.30", "02.00").addCategory("ICTVtu"));
        programs.add(new Programma("СТОП-10                     ", "02.00", "05.00").addCategory("ICTVtu"));
        programs.add(new Programma("Суддя Вашингтон             ", "05.00", "08.00").addCategory("ICTVtu"));

        programs.add(new Programma("Х/ф Гарi Поттер ч1          ", "22.30", "02.00").addCategory("ICTVw"));
        programs.add(new Programma("СТОП-10                     ", "02.00", "05.00").addCategory("ICTVw"));
        programs.add(new Programma("Суддя Вашингтон             ", "05.00", "08.00").addCategory("ICTVw"));

        programs.add(new Programma("Х/ф Гарi Поттер ч2          ", "22.30", "02.00").addCategory("ICTVth"));
        programs.add(new Programma("СТОП-10                     ", "02.00", "05.00").addCategory("ICTVth"));
        programs.add(new Programma("Суддя Вашингтон             ", "05.00", "08.00").addCategory("ICTVth"));

        programs.add(new Programma("Х/ф Гарi Поттер ч3          ", "22.30", "02.00").addCategory("ICTVf"));
        programs.add(new Programma("СТОП-10                     ", "02.00", "05.00").addCategory("ICTVf"));
        programs.add(new Programma("Суддя Вашингтон             ", "05.00", "08.00").addCategory("ICTVf"));

        programs.add(new Programma("Мультфiльми Дiсней          ", "08.00", "10.00").addCategory("ICTVse"));
        programs.add(new Programma("Секретний Фронт             ", "10.00", "12.00").addCategory("ICTVse"));
        programs.add(new Programma("Факти. Iнформацiйний випуск ", "12.00", "14.00").addCategory("ICTVse"));
        programs.add(new Programma("Х/ф Зйти зi шляху           ", "14.00", "16.00").addCategory("ICTVse"));
        programs.add(new Programma("Зiрка Ютуба                 ", "16.00", "18.00").addCategory("ICTVse"));
        programs.add(new Programma("М/ф Крижане Серце           ", "18.00", "20.00").addCategory("ICTVse"));
        programs.add(new Programma("Гарi Поттер ч4              ", "20.00", "22.30").addCategory("ICTVse"));
        programs.add(new Programma("Гарi Поттер ч5              ", "22.30", "02.00").addCategory("ICTVse"));
        programs.add(new Programma("Надзвичайнi новини          ", "02.00", "05.00").addCategory("ICTVse"));
        programs.add(new Programma("Суддя Вашингтон             ", "05.00", "08.00").addCategory("ICTVse"));

        programs.add(new Programma("Мультфiльми Дiсней          ", "08.00", "10.00").addCategory("ICTVsu"));
        programs.add(new Programma("Х/ф Зйти зi шляху           ", "10.00", "12.00").addCategory("ICTVsu"));
        programs.add(new Programma("Факти. Iнформацiйний випуск ", "12.00", "14.00").addCategory("ICTVsu"));
        programs.add(new Programma("Анти-Зомбi                  ", "14.00", "16.00").addCategory("ICTVsu"));
        programs.add(new Programma("Надзвичайнi Новини.Пiдсумки ", "16.00", "18.00").addCategory("ICTVsu"));
        programs.add(new Programma("Гарi Поттер ч6              ", "18.00", "20.00").addCategory("ICTVsu"));
        programs.add(new Programma("Гарi Поттер ч7-1            ", "20.00", "22.30").addCategory("ICTVsu"));
        programs.add(new Programma("Гарi Поттер ч7-2            ", "22.30", "02.00").addCategory("ICTVsu"));
        programs.add(new Programma("Надзвичайнi новини          ", "02.00", "05.00").addCategory("ICTVsu"));
        programs.add(new Programma("Суддя Вашингтон             ", "05.00", "08.00").addCategory("ICTVsu"));
//
        programs.add(new Programma("М/с Губка-Боб            ", "08.00", "10.00")
                .addCategory("NovuyKm")
                .addCategory("NovuyKtu")
                .addCategory("NovuyKw")
                .addCategory("NovuyKth")
                .addCategory("NovuyKf"));
        programs.add(new Programma("Т/с Друзi                ", "10.00", "12.00")
                .addCategory("NovuyKm")
                .addCategory("NovuyKtu")
                .addCategory("NovuyKw")
                .addCategory("NovuyKth")
                .addCategory("NovuyKf")
        );
        programs.add(new Programma("Новини                   ", "12.00", "14.00")
                .addCategory("NovuyKm")
                .addCategory("NovuyKtu")
                .addCategory("NovuyKw")
                .addCategory("NovuyKth")
                .addCategory("NovuyKf")
        );
        programs.add(new Programma("Т/с Моя прекрасна няня   ", "14.00", "16.00")
                .addCategory("NovuyKm")
                .addCategory("NovuyKtu")
                .addCategory("NovuyKw")
                .addCategory("NovuyKth")
                .addCategory("NovuyKf")
        );
        programs.add(new Programma("Абзац                    ", "16.00", "18.00")
                .addCategory("NovuyKm")
                .addCategory("NovuyKtu")
                .addCategory("NovuyKw")
                .addCategory("NovuyKth")
                .addCategory("NovuyKf")
        );
        programs.add(new Programma("Х/ф Сумерки ч1           ", "18.00", "20.00").addCategory("NovuyKm"));
        programs.add(new Programma("Х/ф Сумерки ч2           ", "20.00", "22.30").addCategory("NovuyKm"));
        programs.add(new Programma("Х/ф Рубiнова книга       ", "22.30", "02.00").addCategory("NovuyKm"));
        programs.add(new Programma("Служба пошуку дiтей      ", "02.00", "05.00").addCategory("NovuyKm"));
        programs.add(new Programma("Зона ночi                ", "05.00", "08.00").addCategory("NovuyKm"));

        programs.add(new Programma("Х/ф Сумерки ч2           ", "18.00", "20.00").addCategory("NovuyKtu"));
        programs.add(new Programma("Х/ф Сумерки ч3           ", "20.00", "22.30").addCategory("NovuyKtu"));
        programs.add(new Programma("Х/ф Cапфiрова книга      ", "22.30", "02.00").addCategory("NovuyKtu"));
        programs.add(new Programma("Служба пошуку дiтей      ", "02.00", "05.00").addCategory("NovuyKtu"));
        programs.add(new Programma("Зона ночi                ", "05.00", "08.00").addCategory("NovuyKtu"));

        programs.add(new Programma("Х/ф Сумерки ч3           ", "18.00", "20.00").addCategory("NovuyKw"));
        programs.add(new Programma("Х/ф Сумерки ч4           ", "20.00", "22.30").addCategory("NovuyKw"));
        programs.add(new Programma("Х/ф Рубiнова книга       ", "22.30", "02.00").addCategory("NovuyKw"));
        programs.add(new Programma("Служба пошуку дiтей      ", "02.00", "05.00").addCategory("NovuyKw"));
        programs.add(new Programma("Зона ночi                ", "05.00", "08.00").addCategory("NovuyKw"));

        programs.add(new Programma("Х/ф Сумерки ч4           ", "18.00", "20.00").addCategory("NovuyKth"));
        programs.add(new Programma("Х/ф Сумерки ч5           ", "20.00", "22.30").addCategory("NovuyKth"));
        programs.add(new Programma("Х/ф Cапфiрова книга      ", "22.30", "02.00").addCategory("NovuyKth"));
        programs.add(new Programma("Служба пошуку дiтей      ", "02.00", "05.00").addCategory("NovuyKth"));
        programs.add(new Programma("Зона ночi                ", "05.00", "08.00").addCategory("NovuyKth"));

        programs.add(new Programma("Х/ф Сумерки ч5           ", "18.00", "20.00").addCategory("NovuyKf"));
        programs.add(new Programma("Х/ф Супер Мен            ", "20.00", "22.30").addCategory("NovuyKf"));
        programs.add(new Programma("Х/ф Лiвша                ", "22.30", "02.00").addCategory("NovuyKf"));
        programs.add(new Programma("Служба пошуку дiтей      ", "02.00", "05.00").addCategory("NovuyKf"));
        programs.add(new Programma("Зона ночi                ", "05.00", "08.00").addCategory("NovuyKf"));

        programs.add(new Programma("Ревiзор             ", "08.00", "10.00").addCategory("NovuyKse"));
        programs.add(new Programma("Страстi а ревiзором ", "10.00", "12.00").addCategory("NovuyKse"));
        programs.add(new Programma("М/с Сiмпсони        ", "12.00", "14.00").addCategory("NovuyKse"));
        programs.add(new Programma("Х/ф Рубiнова книга  ", "14.00", "16.00").addCategory("NovuyKse"));
        programs.add(new Programma("Х/ф Сапфiрова книга ", "16.00", "18.00").addCategory("NovuyKse"));
        programs.add(new Programma("М/ф Скубi-Ду        ", "18.00", "20.00").addCategory("NovuyKse"));
        programs.add(new Programma("Х/ф Дивергент ч1    ", "20.00", "22.30").addCategory("NovuyKse"));
        programs.add(new Programma("Х/ф Дивергент ч2    ", "22.30", "02.00").addCategory("NovuyKse"));
        programs.add(new Programma("Зона ночi           ", "02.00", "05.00").addCategory("NovuyKse"));
        programs.add(new Programma("Кидс-Тайм           ", "05.00", "08.00").addCategory("NovuyKse"));

        programs.add(new Programma("Новини              ", "08.00", "10.00").addCategory("NovuyKsu"));
        programs.add(new Programma("М/с Губка Боб       ", "10.00", "12.00").addCategory("NovuyKsu"));
        programs.add(new Programma("М/ф Скубi-Ду        ", "12.00", "14.00").addCategory("NovuyKsu"));
        programs.add(new Programma("Х/ф Дивергент ч1    ", "14.00", "16.00").addCategory("NovuyKsu"));
        programs.add(new Programma("Х/ф Дивергент ч2    ", "16.00", "18.00").addCategory("NovuyKsu"));
        programs.add(new Programma("Гаррi Поттер ч1     ", "18.00", "20.00").addCategory("NovuyKsu"));
        programs.add(new Programma("Людина Павук ч1     ", "20.00", "22.30").addCategory("NovuyKsu"));
        programs.add(new Programma("Людина Павук ч2     ", "22.30", "02.00").addCategory("NovuyKsu"));
        programs.add(new Programma("Зона ночi           ", "02.00", "05.00").addCategory("NovuyKsu"));
        programs.add(new Programma("Кидс-Тайм           ", "05.00", "08.00").addCategory("NovuyKsu"));
//        ---------------------------
        programs.add(new Programma("Лунтiк                     ", "08.00", "10.00")
                .addCategory("TETm")
                .addCategory("TETtu")
                .addCategory("TETw")
                .addCategory("TETth")
                .addCategory("TETf")
        );
        programs.add(new Programma("Панянка-Селянка            ", "10.00", "12.00")
                .addCategory("TETm")
                .addCategory("TETtu")
                .addCategory("TETw")
                .addCategory("TETth")
                .addCategory("TETf")
        );
        programs.add(new Programma("Перевтiлення.Дiм за тиждень", "12.00", "14.00")
                .addCategory("TETm")
                .addCategory("TETtu")
                .addCategory("TETw")
                .addCategory("TETth")
                .addCategory("TETf")
        );
        programs.add(new Programma("Вiталька                   ", "14.00", "16.00")
                .addCategory("TETm")
                .addCategory("TETtu")
                .addCategory("TETw")
                .addCategory("TETth")
                .addCategory("TETf")
        );
        programs.add(new Programma("Країна У                   ", "16.00", "18.00")
                .addCategory("TETm")
                .addCategory("TETtu")
                .addCategory("TETw")
                .addCategory("TETth")
                .addCategory("TETf")
        );
        programs.add(new Programma("Т/с Свiтлофор              ", "18.00", "20.00")
                .addCategory("TETm")
                .addCategory("TETtu")
                .addCategory("TETw")
                .addCategory("TETth")
                .addCategory("TETf")
        );
        programs.add(new Programma("Т/с Ангел або Демон        ", "20.00", "22.30")
                .addCategory("TETm")
                .addCategory("TETtu")
                .addCategory("TETw")
                .addCategory("TETth")
                .addCategory("TETf")
        );
        programs.add(new Programma("Х/ф Людина павук 1         ", "22.30", "02.00").addCategory("TETm"));
        programs.add(new Programma("Теорiя заговору            ", "02.00", "05.00").addCategory("TETm"));
        programs.add(new Programma("Це кохання...              ", "05.00", "08.00").addCategory("TETm"));

        programs.add(new Programma("Х/ф Людина павук 2         ", "22.30", "02.00").addCategory("TETtu"));
        programs.add(new Programma("Теорiя заговору            ", "02.00", "05.00").addCategory("TETtu"));
        programs.add(new Programma("Це кохання...              ", "05.00", "08.00").addCategory("TETtu"));

        programs.add(new Programma("Х/ф Людина павук 3         ", "22.30", "02.00").addCategory("TETw"));
        programs.add(new Programma("Теорiя заговору            ", "02.00", "05.00").addCategory("TETw"));
        programs.add(new Programma("Це кохання...              ", "05.00", "08.00").addCategory("TETw"));
        programs.add(new Programma("Х/ф Нова Людина павук 1    ", "22.30", "02.00").addCategory("TETth"));
        programs.add(new Programma("Теорiя заговору            ", "02.00", "05.00").addCategory("TETth"));
        programs.add(new Programma("Це кохання...              ", "05.00", "08.00").addCategory("TETth"));
        programs.add(new Programma("Х/ф Нова Людина павук 2    ", "22.30", "02.00").addCategory("TETf"));
        programs.add(new Programma("Теорiя заговору            ", "02.00", "05.00").addCategory("TETf"));
        programs.add(new Programma("Це кохання...              ", "05.00", "08.00").addCategory("TETf"));
        programs.add(new Programma("Лунтiк                     ", "08.00", "10.00").addCategory("TETse"));
        programs.add(new Programma("Країна У                   ", "10.00", "12.00").addCategory("TETse"));
        programs.add(new Programma("Перевтiлення.Дiм за тиждень", "12.00", "14.00").addCategory("TETse"));
        programs.add(new Programma("Вiталька                   ", "14.00", "16.00").addCategory("TETse"));
        programs.add(new Programma("М/ф Планета Скарбiв        ", "16.00", "18.00").addCategory("TETse"));
        programs.add(new Programma("Х/ф 13 легiон              ", "18.00", "20.00").addCategory("TETse"));
        programs.add(new Programma("Х/ф Прометей               ", "20.00", "22.30").addCategory("TETse"));
        programs.add(new Programma("Х/ф Хронiки Рiдiка         ", "22.30", "02.00").addCategory("TETse"));
        programs.add(new Programma("Теорiя заговору            ", "02.00", "05.00").addCategory("TETse"));
        programs.add(new Programma("Це кохання...              ", "05.00", "08.00").addCategory("TETse"));
        programs.add(new Programma("Лунтiк                     ", "08.00", "10.00").addCategory("TETsu"));
        programs.add(new Programma("Країна У                   ", "10.00", "12.00").addCategory("TETsu"));
        programs.add(new Programma("М/ф Планета Скарбiв        ", "12.00", "14.00").addCategory("TETsu"));
        programs.add(new Programma("Х/ф Прометей               ", "14.00", "16.00").addCategory("TETsu"));
        programs.add(new Programma("Х/ф Хронiки Рiдiка         ", "16.00", "18.00").addCategory("TETsu"));
        programs.add(new Programma("М/ф Тачки                  ", "18.00", "20.00").addCategory("TETsu"));
        programs.add(new Programma("Х/фТупий та ще тупiший     ", "20.00", "22.30").addCategory("TETsu"));
        programs.add(new Programma("Я-Франкенштейн             ", "22.30", "02.00").addCategory("TETsu"));
        programs.add(new Programma("Теорiя заговору            ", "02.00", "05.00").addCategory("TETsu"));
        programs.add(new Programma("Це кохання...              ", "05.00", "08.00").addCategory("TETsu"));

        programs.add(new Programma("М/с Лiлу i Стiч          ", "08.00", "10.00")
                .addCategory("K1m")
                .addCategory("K1tu")
                .addCategory("K1w")
                .addCategory("K1th")
                .addCategory("K1f")
        );
        programs.add(new Programma("Орел i решка(повтор)     ", "10.00", "12.00")
                .addCategory("K1m")
                .addCategory("K1tu")
                .addCategory("K1w")
                .addCategory("K1th")
                .addCategory("K1f")
        );
        programs.add(new Programma("Файна-Юкрайна            ", "12.00", "14.00")
                .addCategory("K1m")
                .addCategory("K1tu")
                .addCategory("K1w")
                .addCategory("K1th")
                .addCategory("K1f")
        );
        programs.add(new Programma("Т/с 90210: Нове поколiння", "14.00", "16.00")
                .addCategory("K1m")
                .addCategory("K1tu")
                .addCategory("K1w")
                .addCategory("K1th")
                .addCategory("K1f")
        );
        programs.add(new Programma("Орел i решка             ", "16.00", "18.00")
                .addCategory("K1m")
                .addCategory("K1tu")
                .addCategory("K1w")
                .addCategory("K1th")
                .addCategory("K1f"));
        programs.add(new Programma("Розсмiши комiка          ", "18.00", "20.00")
                .addCategory("K1m")
                .addCategory("K1tu")
                .addCategory("K1w")
                .addCategory("K1th")
                .addCategory("K1f")
        );
        programs.add(new Programma("Т/с Доктор Хаус          ", "20.00", "22.30")
                .addCategory("K1m")
                .addCategory("K1tu")
                .addCategory("K1w")
                .addCategory("K1th")
                .addCategory("K1f")
        );
        programs.add(new Programma("Т/с Доктор Хаус          ", "22.30", "02.00")
                .addCategory("K1m")
                .addCategory("K1tu")
                .addCategory("K1w")
                .addCategory("K1th")
                .addCategory("K1f")
        );
        programs.add(new Programma("Бiйцiвський Клуб         ", "02.00", "05.00")
                .addCategory("K1m")
                .addCategory("K1tu")
                .addCategory("K1w")
                .addCategory("K1th")
                .addCategory("K1f")
        );
        programs.add(new Programma("Нiчне життя              ", "05.00", "08.00")
                .addCategory("K1m")
                .addCategory("K1tu")
                .addCategory("K1w")
                .addCategory("K1th")
                .addCategory("K1f")
        );


        programs.add(new Programma("Рецепти Щастя         ", "08.00", "10.00").addCategory("K1se"));
        programs.add(new Programma("Розсмiши комiка       ", "10.00", "12.00").addCategory("K1se"));
        programs.add(new Programma("Х/ф Майстер           ", "12.00", "14.00").addCategory("K1se"));
        programs.add(new Programma("Орел i решка          ", "14.00", "16.00").addCategory("K1se"));
        programs.add(new Programma("Х/ф Перевiзник        ", "16.00", "18.00").addCategory("K1se"));
        programs.add(new Programma("М/ф Рiздвяна iсторiя  ", "18.00", "20.00").addCategory("K1se"));
        programs.add(new Programma("Х/ф Залiзна Людина 1  ", "20.00", "22.30").addCategory("K1se"));
        programs.add(new Programma("Х/ф Залiзна Людина 2  ", "22.30", "02.00").addCategory("K1se"));
        programs.add(new Programma("Бiйцiвський Клуб      ", "02.00", "05.00").addCategory("K1se"));
        programs.add(new Programma("Нiчне життя           ", "05.00", "08.00").addCategory("K1se"));
        programs.add(new Programma("Орел i решка          ", "08.00", "10.00").addCategory("K1su"));
        programs.add(new Programma("Рецепти Щастя         ", "10.00", "12.00").addCategory("K1su"));
        programs.add(new Programma("Розсмiши комiка       ", "12.00", "14.00").addCategory("K1su"));
        programs.add(new Programma("Х/ф Повелитель стихiй ", "14.00", "16.00").addCategory("K1su"));
        programs.add(new Programma("Х/ф Воїн              ", "16.00", "18.00").addCategory("K1su"));
        programs.add(new Programma("Х/ф Я - Дракон        ", "18.00", "20.00").addCategory("K1su"));
        programs.add(new Programma("Х/ф Залiзна Людина 2  ", "20.00", "22.30").addCategory("K1su"));
        programs.add(new Programma("Х/ф Залiзна Людина 3  ", "22.30", "02.00").addCategory("K1su"));
        programs.add(new Programma("Бiйцiвський Клуб      ", "02.00", "05.00").addCategory("K1su"));
        programs.add(new Programma("Нiчне життя           ", "05.00", "08.00").addCategory("K1su"));

        programs.add(new Programma("Зiркове життя               ", "08.00", "10.00")
                .addCategory("CTBm")
                .addCategory("CTBtu")
                .addCategory("CTBw")
                .addCategory("CTBth")
                .addCategory("CTBf")
        );
        programs.add(new Programma("Битва Екстрасенсiв          ", "10.00", "12.00")
                .addCategory("CTBm")
                .addCategory("CTBtu")
                .addCategory("CTBw")
                .addCategory("CTBth")
                .addCategory("CTBf")
        );
        programs.add(new Programma("Т/с Коли ми вдома           ", "12.00", "14.00")
                .addCategory("CTBm")
                .addCategory("CTBtu")
                .addCategory("CTBw")
                .addCategory("CTBth")
                .addCategory("CTBf")
        );
        programs.add(new Programma("Танцюють всi                ", "14.00", "16.00")
                .addCategory("CTBm")
                .addCategory("CTBtu")
                .addCategory("CTBw")
                .addCategory("CTBth")
                .addCategory("CTBf")
        );
        programs.add(new Programma("Все Буде добре              ", "16.00", "18.00")
                .addCategory("CTBm")
                .addCategory("CTBtu")
                .addCategory("CTBw")
                .addCategory("CTBth")
                .addCategory("CTBf")
        );
        programs.add(new Programma("Зваженi та щасливi          ", "18.00", "20.00")
                .addCategory("CTBm")
                .addCategory("CTBtu")
                .addCategory("CTBw")
                .addCategory("CTBth")
                .addCategory("CTBf")
        );
        programs.add(new Programma("Т/с Мажор                   ", "20.00", "22.30")
                .addCategory("CTBm")
                .addCategory("CTBtu")
                .addCategory("CTBw")
                .addCategory("CTBth")
                .addCategory("CTBf")
        );
        programs.add(new Programma("Один за всiх                ", "22.30", "02.00")
                .addCategory("CTBm")
                .addCategory("CTBtu")
                .addCategory("CTBw")
                .addCategory("CTBth")
                .addCategory("CTBf")
        );
        programs.add(new Programma("Слiдство ведуть екстрасенси ", "02.00", "05.00")
                .addCategory("CTBm")
                .addCategory("CTBtu")
                .addCategory("CTBw")
                .addCategory("CTBth")
                .addCategory("CTBf")
        );
        programs.add(new Programma("Т/с Адьютант короля         ", "05.00", "08.00")
                .addCategory("CTBm")
                .addCategory("CTBtu")
                .addCategory("CTBw")
                .addCategory("CTBth")
                .addCategory("CTBf")
        );


        programs.add(new Programma("Караоке на майданi          ", "08.00", "10.00").addCategory("CTBse"));
        programs.add(new Programma("Все буде смачно             ", "10.00", "12.00").addCategory("CTBse"));
        programs.add(new Programma("Т/с Коли ми вдома           ", "12.00", "14.00").addCategory("CTBse"));
        programs.add(new Programma("Х/ф За двома зайцями        ", "14.00", "16.00").addCategory("CTBse"));
        programs.add(new Programma("Хата на Тата                ", "16.00", "18.00").addCategory("CTBse"));
        programs.add(new Programma("Х-Фактор                    ", "18.00", "20.00").addCategory("CTBse"));
        programs.add(new Programma("Танцюють всi                ", "20.00", "22.30").addCategory("CTBse"));
        programs.add(new Programma("Зваженi та Щасливi          ", "22.30", "02.00").addCategory("CTBse"));
        programs.add(new Programma("Слiдство ведуть екстрасенси ", "02.00", "05.00").addCategory("CTBse"));
        programs.add(new Programma("Т/с Адьютант короля         ", "05.00", "08.00").addCategory("CTBse"));
        programs.add(new Programma("Караоке на майданi          ", "08.00", "10.00").addCategory("CTBsu"));
        programs.add(new Programma("Все буде смачно             ", "10.00", "12.00").addCategory("CTBsu"));
        programs.add(new Programma("Х-Фактор                    ", "12.00", "14.00").addCategory("CTBsu"));
        programs.add(new Programma("Майстер Шеф                 ", "14.00", "16.00").addCategory("CTBsu"));
        programs.add(new Programma("Один за всiх                ", "16.00", "18.00").addCategory("CTBsu"));
        programs.add(new Programma("Кохана,ми вбиваэмо дiтей    ", "18.00", "20.00").addCategory("CTBsu"));
        programs.add(new Programma("Х/ф Шукайте жiнку           ", "20.00", "22.30").addCategory("CTBsu"));
        programs.add(new Programma("Детектор брехнi             ", "22.30", "02.00").addCategory("CTBsu"));
        programs.add(new Programma("Слiдство ведуть екстрасенси ", "02.00", "05.00").addCategory("CTBsu"));
        programs.add(new Programma("Т/с Адьютант короля         ", "05.00", "08.00").addCategory("CTBsu"));

    }

    public List<Programma> getByCategory(String category) {
        List<Programma> filteredList = new ArrayList<>();
        for (Programma programma : programs) {
            if (programma.getCategories().contains(category))
                filteredList.add(programma);
        }
        return filteredList;
    }
}
