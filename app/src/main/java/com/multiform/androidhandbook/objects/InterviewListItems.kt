package com.multiform.androidhandbook.objects

import com.multiform.androidhandbook.R
import com.multiform.androidhandbook.models.ListArticleItem
import com.multiform.androidhandbook.models.MainListItem

object InterviewListItems {

    private val trainingList = mutableListOf(
        ListArticleItem("Время", R.drawable.ic_app_components, false,
            "Сколько надо времени на подготовку? Мой ответ: 1–2 недели. Этого вполне достаточно. Ну, конечно же, если вы не метите в Гугл) Тогда сроки однозначно увеличиваются."),
        ListArticleItem("Портфолио", R.drawable.ic_app_components, false,
            "Надо ли иметь хорошее «портфолио»? Да!… Конечно же можно и без хорошего аккаунта на GitHub, например,… но меня мои pet-projects не раз спасали от скучных тестовых заданий! И, к тому же, Вы быстрее попадете на техническое собеседование."),
        ListArticleItem("Вопросы", R.drawable.ic_app_components, false,
            "Итак, Вы готовы приступить к подготовке… Что дальше? Составьте список вопросов, которые уже задавали другим Android разработчикам (в данном случае просто смотрите вопросы в списках ниже). И обязательно внимательно посмотрите требования к «интересным» вакансиям! Если там есть «Custom View», то обязательно вызубрите этапы создания этих несчастных вьюх! Спросят 100%!"),
        ListArticleItem("Теория", R.drawable.ic_app_components, false,
            "Дальше…Берёте небольшой блокнонт (размер не больше вашей ладони — просто удобно носить с собой) и пишите: Вопрос («Что такое Observable?») из списка подготовленных (см. пункт 3) и ниже Ответ (Это асинхронный паттерн проектирования, в котором данные представлены в виде потока событий….и так далее). Пишите от руки! Поверьте, это очень важно! \n" +
                    "Теперь у Вас есть готовый блоконот с основными вопросами и ответами…едем дальше…Встали с утра, собрались, поехали на метро… открываем блоконт и читаем, читаем, читаем… также едем обратно… читаем, читаем, читаем…\n" +
                    "Просто читаем? Нет! Прочитали вопрос…прикрыли блокнот и своими словами пытаемся сами себе рассказать… Забыли? Снова открываем блокнот, читаем ответ, закрываем, отвечаем и так далее пока не запомнили.\n" +
                    "Вот вы прочитали вопрос, рассказали самому себе ответ и вроде бы всё хорошо…Анализируйте! Прокрутите в голове свой ответ. Найдите термины, информацию, которая подтолкнет вашего «экзаменатора» на новые вопросы. И обязательно выпишите ответы на них!"),
        ListArticleItem("Практика", R.drawable.ic_app_components, false),
        ListArticleItem("Soft-скилы", R.drawable.ic_app_components, false),
        ListArticleItem("Вопросы для вас", R.drawable.ic_app_components, false),
        ListArticleItem("Что делать/не делать", R.drawable.ic_app_components, false,
            "Забегая вперед, скажу, после собеседования (или даже, прямо, во время) записывайте вопросы, на которые не ответили. Пишите в копилочку-блокнот и позднее обязательно письменно отвечайте. Пополняем базу знаний)"),
        ListArticleItem("Итоги", R.drawable.ic_app_components, false)
    )

    private val androidSdkList = mutableListOf(
        ListArticleItem("Activity", R.drawable.ic_app_components, false),
        ListArticleItem("Save activity state", R.drawable.ic_app_components, false,
            "onSaveInstanceState() - метод в котором мы можем сохранить данные активности при рестарте (например, повороте экрана) в пределах одного запуска приложения. Данные нужно предавать до вызова супер метода.\n" +
                    "onRestoreInstanceState() - метод в котором мы можем достать данные из state, помимо onCreate(). Разница в том, что этот метод вызывается после метода onStart(). Обязательно нужно проверить что Бандл не нулл перед восстановлением данных. Он = нулл при запуске приложения."),
        ListArticleItem("Launch Modes", R.drawable.ic_app_components, false,
            "Task - это отдельный процесс в системе, который создается когда мы хотим сделать действие, запустить новую задачу, например, запустить приложение.\n" +
                    "Backstack - это хранилище Activities внутри Task, где упорядочиваются наши активити с помощью типа хранения данных \"стэк\".\n" +
                    "Launch Modes - это инструкции по запуску активностей, позволяющие указать нужно ли создавать новую активность или использовать уже существующую и др. Этот атрибут указывается в манифсте у <activity>. \n" +
                    "Существует 4 режима LaunchMode: \n " +
                    "\"standart\" - поведение Activity, установленного в этот режим, будет всегда создавать новую Activity, чтобы работать отдельно с каждым отправленным Intent. \n" +
                    "\"singleTop\" - режим ведет себя почти так же, как и standard. Отличие состоит в том, что если уже есть экземпляр Activity с таким же типом наверху стека, не будет создано никакого нового Activity, вместо этого Intent будет отправлен существующему экземпляру Activity через метод onNewIntent(). \n" +
                    "\"singleTask\" - Activity разрешено иметь только один экземпляр в системе. Если в системе уже существует такой Activity, Task, удерживающий экземпляр, будет перемещен наверх, а Intent будет предоставлен через метод onNewIntent(). В противном случае будет создано новое Activity и помещено в новый Task. \n" +
                    "\"singleInstance\" - Task в этом режиме может иметь только одно Activity — то, у которого атрибут singleInstance. Если из этого Activity вызывается другое Activity, автоматически создается новый Task для размещения этого нового Activity. \n" +
                    "Работают они в связке с Intent-флагами, котрые поступают из Intent-объекта."),
        ListArticleItem("taskAffinity", R.drawable.ic_app_components, false,
            "Этот атрибут <activity> указывает к какой задаче привязаны действия в данной активити. Пустое заначение \"\" будет означать, что действия не привязаны ни к какой задаче."),
        ListArticleItem("Intent flags", R.drawable.ic_app_components, false,
            "Помимо LaunchMode мы так же можем конфигурировать поведение активити с помощью Интент-флагов, указывая их в методе addFlags() нового Intent."),
        ListArticleItem("Виды Intent", R.drawable.ic_app_components, false,
            "Intent это объект описания одной операции. С помощью интент можно запросить выполнение действия у приложения. Обычно интент используется в 3 сценариях: \n" +
                    "1. Для запуска операции: объект Intent описывает операцию, которую требуется запустить, а также содержит все остальные необходимые данные. Объект запускает новую Activity с помощью метода startActivity(). Если после завершения операции от нее требуется получить результат, вызовите метод startActivityForResult(). Ваша операция получит результат в виде отдельного объекта Intent в обратном вызове метода onActivityResult() операции. \n" +
                    "2. Для запуска службы: службу можно запустить для выполнения однократного действия (например, чтобы загрузить файл), передав объектIntent методу startService(). Service является компонентом, который выполняет действия в фоновом режиме без пользовательского интерфейса. Объект Intent описывает службу, которую требуется запустить, а также содержит все остальные необходимые данные. Если служба сконструирована с интерфейсом клиент-сервер, к ней можно установить привязку из другого компонента, передав объектIntent методу bindService(). \n" +
                    "3. Для рассылки широковещательных сообщений: широковещательное сообщение ― это сообщение, которое может принять любое приложение. Система выдает различные широковещательные сообщения о системных событиях, например, когда система загружается или устройство начинает заряжаться. Для выдачи широковещательных сообщений другим приложениям необходимо передать объект Intent методу sendBroadcast(), sendOrderedBroadcast() или sendStickyBroadcast(). \n" +
                    "Существует 2 типа объекта интент. \n" +
                    "1. Явный объект Intent - они указывают компонент, который требуется запустить, по имени ( полное имя класса). Явные объекты Intent обычно используются для запуска компонента из вашего собственного приложения, поскольку вам известно имя класса операции или службы, которую необходимо запустить. Например , можно запустить новую операцию в ответ на действие пользователя или запустить службу, чтобы загрузить файл в фоновом режиме. \n" +
                    "2. Неявный объект Intent - они не содержат имени конкретного компонента. Вместо этого они в целом объявляют действие, которое требуется выполнить, что дает возможность компоненту из другого приложения обработать этот запрос. Например, если требуется показать пользователю место на карте, то с помощью неявного объекта Intent можно запросить, чтобы это сделало другое приложение, в котором такая возможность предусмотрена."),
        ListArticleItem("ContentProvider", R.drawable.ic_app_components, false,
            "Контент-провайдер или \"Поставщик содержимого\" (Content Provider) - это оболочка (wrapper), в которую заключены данные. Если ваше приложение использует базу данных SQLite, то только ваше приложение имеет к ней доступ. Но бывают ситуации, когда данные желательно сделать общими. Простой пример - ваши контакты из телефонной книги тоже содержатся в базе данных, но вы хотите иметь доступ к данным, чтобы ваше приложение тоже могло выводить список контактов. Так как вы не имеете доступа к базе данных другого приложения, был придуман специальный механизм, позволяющий безопасно получать доступ и делиться своими данными c другими приложениями. \n" +
                    "Поставщики контента предлагают детальный контроль над разрешениями на доступ к данным. Вы можете ограничить доступ к поставщику контента исключительно из вашего приложения, предоставить полное разрешение на доступ к данным из других приложений или настроить различные разрешения для чтения и записи данных."),
        ListArticleItem("Типы сервисов (IntentService)", R.drawable.ic_app_components, false,
            "IntentService – это подкласс Service который создает поток для выполнения фоновой работы. Он используется, если надо выполнять какие-то тяжёлые задачи с намерениями, которые могут выполняться асинхронно. Он создаёт новый поток для своей работы, затем мониторит все входящие намерения и отправляет их на обработку в этот поток. Далее в коде вы определяете, как обработать Intent. Вы можете отправить данные обратно в приложение через широковещательное сообщение и принять сообщение через широковещательный приёмник. \nИными словами, приложение посылает в сервис данные через метод startService(), в которых передаёт намерения. IntentService принимает эти вызовы, берёт намерения последовательно и отправляет их в очередь на обработку. И далее они поочерёдно обрабатываются в отдельном потоке методом onHandleIntent() по одному за раз. Когда последний Intent из очереди будет обработан, сервис сам завершит свою работу. \nРазличия Service и IntentService: \n1. Класс сервиса использует основной поток приложения, а IntentService создает рабочий поток и использует этот поток для запуска службы.\n" +
                    "2. IntentService создает очередь, которая передает одно намерение за раз в onHandleIntent (). Таким образом, реализация многопоточного потока должна выполняться путем непосредственного распространения класса сервиса.\n" +
                    "3. Для класса обслуживания требуется ручная остановка с использованием stopSelf (). Тем временем IntentService автоматически останавливается, когда в очереди нет намерений.\n" +
                    "4. IntentService реализует onBind (), который возвращает null. Это означает, что IntentService не может быть привязан по умолчанию.\n" +
                    "5. IntentService реализует onStartCommand (), который отправляет Intent в очередь и на onHandleIntent ()."),
        ListArticleItem("Threads", R.drawable.ic_app_components, false,
            "Main (UI) поток - это основной поток приложения. В нем запускается главное активити приложения и отрабатывает основной интерфейс приложения.\n " +
                    "Все методы жизненного цикла активити вызываются в главном потоке.\n" +
                    "При запуске длительной операции (более 5 сек) в главном потоке мы получим ошибку ANR(Application Not Responsive), в результате которой система предложит убить наше приложение.\n" +
                    "Все длительные операции нужно вызывать в background потоке.\n" +
                    "Чтобы запостить данные в из БГ потока в UI поток, можно использовать методы View.post(), runOnUiThread {}, Handler.post()."),
        ListArticleItem("Handler, Looper, MessageQueue", R.drawable.ic_app_components, false,
            "Приложения в Android запускаются в виртуальной машине, использующей Java Runtime. В Java вся работа выполняется в потоках. Поток заканчивает работу, когда отрабатывает метод run(). В Android главный (UI) поток не всегда занят выполнением какой-либо задачи и часто находится в ожидании действий пользователя или событий системы. Для реализации такого поведения в Android используются три сущности, которые работают вместе: Looper, MessageQueue и Handler.\n" +
                    "Looper запускает цикл обработки сообщений, связанный с потоком. Поток работает, пока связанный с ним лупер не будет остановлен. Важным характером Looper является то, что он связан с потоком, в котором создается Looper. Эта связь хранится вечно и не может быть нарушена или изменена. Также, поток не может быть связан с более чем одним Looper. \nДля создания лупера, вызывается статический метод Looper.prepare(). Созданный лупер будет связан с потоком, в котором вызван этот метод. Для старта лупера используется статический метод Looper.loop(). Между вызовами методов prepare() и loop() обычно создается Handler, который будет обрабатывать сообщения, приходящие в MessageQueue лупера. Для остановки лупера используется метод quit() или quitSafely(). Разница между этими методами в том, что quit() останавливает лупер незамедлительно, а quitSafely() завершает обработку сообщений, которые уже добавлены в очередь. Эти методы не статические и вызываются на инстансе класса Looper. Получить лупер текущего потока можно статическим методом Looper.myLooper(). Лупер UI потока можно получить методом Looper.getMainLooper().\n" +
                    "Handler – это класс, который используется для работы с очередью сообщений, связанной с потоком. Хэндлер позволяет отправлять сообщения в другие потоки с задержкой или без, а также обрабатывать полученные сообщения. Хэндлер всегда связан с лупером, который в свою очередь связан с каким-либо потоком. В отличие от Looper, несколько экземпляров Handler могут быть привязаны к одному и тому же потоку. При создании хэндлера в конструктор можно передать объект Looper. Если используется дефолтный конструктор, то хэндлер создается на текущем потоке. Если с потоком не связан лупер, то при создании хэндлера бросается RuntimeException.\n" +
                    "Методы post*() используются для шедулинга объектов Runnable, которые выполняются на связанном с хэндлером потоке. Объекты Runnable добавляются в очередь сообщений. Метод post(action: Runnable) добавляет объект action в конец очереди без специального условия по времени, т.е. action будет запущен, как только это будет возможно. Методы postAtTime() и postDelayed() принимают параметром конфигурацию времени (точное время и задержку относительно текущего времени соответственно). На скриншоте пример шедулинга действия на UI потоке. Класс Handler имеет методы send*(), аналогичные методам post*(), но для шедулинга объектов Message, которые позволяют передать произвольный объект." +
                    "MessageQueue - это класс с помощью которого реализована очередь сообщений, с которыми работают Handler и Looper. MessageQueue не имеет публичных методов для работы с сообщениями. Работа с очередью выполняется через методы класса Handler. MessageQueue хранит объекты класса Message.\n" +
                    "В объекте message можно передать Bundle, который добавляется и получается методами setData() и getData(). Помимо data-bundle в message есть два публичных поля типа int: arg1 и arg2, а также публичное поле obj типа Object. Эти поля используются в тех случаях, когда нужно передать целочисленное значение или произвольный объект, и нет необходимости создавать bundle. Также класс Message имеет публичное целочисленное поле what, которое по смыслу подобно параметру requestCode в методе startActivityForResult() и используется для определения о чем это сообщение. Класс Message имеет публичный конструктор, но вместо него рекомендуется использовать статические методы Message.obtain() или Handler.obtainMessage(). Методы obtain возвращают message из пула объектов. После обработки сообщения нужно вызвать метод Message.recycler(), для освобождения связанных ресурсов и возвращения объекта message в пул. Помимо объектов с данными в message можно задать callback типа Runnable, который будет вызван хэндлером после обработки сообщения. Для этого сообщение создается методом Message.obtain(handler: Handler, callback: Runnable)."),
        ListArticleItem("Планировщики задач", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("Serializable / Parcelable", R.drawable.ic_app_components, false,
            "Сериализация (Serialization) — это процесс, который переводит объект в последовательность байтов, по которой затем его можно полностью восстановить. При обычном выполнении программы срок жизни любого объекта — от запуска программы до ее окончания. Сериализация позволяет существовать объекту между запусками программы. Сериализация нужна для межпроцессорного взаимодействия.\n" +
                    "Serializable - это интерфейс, не имеющий методов, который указывает jvm, что объекты этого класса могут быть сериализованы. Так как механизм сериализации связан с базовой системой ввода/вывода и переводит объект в поток байтов, для его выполнения необходимо создать выходной поток OutputStream, упаковать его в ObjectOutputStream и вызвать метод writeObject(). Для восстановления объекта нужно упаковать InputStream в ObjectInputStream и вызвать метод readObject().\n" +
                    "Parcelable - это интерфейс для классов, экземпляры которых могут быть записаны и восстановлены из класса Parcel. Если класс реализует интерфейс Parcelable, поля класса сериализуются в методе writeToParcel().\n" +
                    "Также parcelable класс обязан иметь статическое ненулевое поле, названное CREATOR типа Creator<T>. Интерфейс Creator<T> имеет два метода createFromParcel(parcel: Parcel): T и newArray(size: Int): Array<T>. Эти методы обратные writeToParcel() и используются для чтения данных из Parcel и создания объекта. Объект Parcelable записывается в контейнер Parcel, который имеет метод marshall(): Array<Byte> для представления объекта в виде массива байтов.\n" +
                    "При изменении структуры объекта или реализации метода writeToParcel() байтовое представление, которое возвращается методом marshall(), будет изменено. Поэтому строго не рекомендуется записывать его в персистентное хранилище.\n" +
                    "Существует расхожее мнение, что Serializable медленнее, чем Parcelable. Serializable использует рефлекшн и создает много дополнительных объектов, а в Parcelable разработчик сам указывает какие объекты сериализовать. Исходя из этого умозаключения, рекомендуется всегда использовать Parcelable.\n" +
                    "Но на самом деле такое сравнение Serializable и Parcelable не совсем честное. Дело в том, что в Serializable тоже есть режим «ручного управления». Чтобы не использовать рефлекшн и задать сериализуемые поля вручную, нужно использовать методы writeObject() и readObject() в serializable-классе. В этом случае Serializable работает быстрее, чем Parcelable."),
        ListArticleItem("addOnBackStackChangeListener", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("Dialog / DialogFragment", R.drawable.ic_app_components, false,
            "Dialog - это небольшое окно, в котором пользователю предлагается принять решение или ввести дополнительную информацию. Диалоговое окно не заполняет экран и обычно используется для модальных событий, которые требуют, чтобы пользователи совершили действие, прежде чем продолжить.\n" +
                    "Для создания Диалога следует использовать один из следующих классов:\n" +
                    "AlertDialog - диалоговое окно, которое может отображать заголовок, до трех кнопок, список выбираемых элементов или настраиваемый макет.\n" +
                    "DatePickerDialog или TimePickerDialog - диалог с предопределенным пользовательским интерфейсом, который позволяет пользователю выбрать дату или время.\n" +
                    "Вы должны использовать DialogFragment в качестве контейнера для вашего диалога. Класс DialogFragment предоставляет все элементы управления, необходимые для создания вашего диалога и управления его внешним видом.\n" +
                    "Использование DialogFragment для управления диалоговым окном гарантирует, что оно правильно обрабатывает события жизненного цикла, например, когда пользователь нажимает кнопку «назад» или поворачивает экран. DialogFragment также позволяет повторно использовать пользовательский интерфейс в диалоговом окне в качестве встраиваемого компонента в большей UI, так же, как традиционные Fragment.\n"),
        ListArticleItem("Clean architecture", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("MVC, MVP, MVVM, MVI", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("MVP / MVVM - отличия", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("Dagger 2", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("Doze Mode", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("LiveData", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("ViewModel", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("Room / Moxy / Realm", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("invalidate() in view", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("ValueAnimator / ObjectAnimator", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("Paging library", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("Zygote", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("Bundle", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("Spannable", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("context activity / application context", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("Что прописываем в манифесте?", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("setRetainInstance in fragment", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    ""),
        ListArticleItem("AsyncTask", R.drawable.ic_app_components, false,
            "\n" +
                    "\n" +
                    "\n" +
                    "")
    )

    val interviewList = mutableListOf(
        MainListItem("Подготовка", R.drawable.ic_app_components, trainingList),
        MainListItem("Android SDK", R.drawable.ic_app_components, androidSdkList),
        MainListItem("RxJava & Coroutines", R.drawable.ic_app_components),
        MainListItem("Libraries", R.drawable.ic_app_components),
        MainListItem("Kotlin", R.drawable.ic_app_components),
        MainListItem("Java", R.drawable.ic_app_components),
        MainListItem("Общие вопросы", R.drawable.ic_app_components),
        MainListItem("Примеры задач", R.drawable.ic_app_components),
        MainListItem("Материалы для подготовки", R.drawable.ic_app_components)
    )
}