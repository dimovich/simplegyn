(ns simplegyn.components
  #?(:clj (:require [hiccup.page :as hp])))

#?(:clj
   (def header
     [:head
      [:title "SimpleGyn"]
      [:meta {:charset "UTF-8"}]
      [:meta {:name "viewport"
              :content "width=device-width, initial-scale=1"}]
      (hp/include-css "/css/tachyons.min.css")]))



(defn merge-opts [m1 m2]
  (merge-with #(str %1 " " %2) m1 m2))


(defn logo []
  [:div {:class "w-60 w-30-ns center"}
   [:img {:src "/img/logo.svg"}]])



(defn nav-button [text & [opts]]
  [:a (merge
       {:class "f5 f4-ns link bg-animate black-80 hover-bg-light-pink dib pa3 ph4-l"
        :href "#"
        :title text}
       opts)
   text])



(defn nav []
  [:nav {:class "bt bb tc mw6 center mt2"}
   (nav-button "Home" {:href "/"})
   (nav-button "Posts" {:href "/"})
   (nav-button "About" {:href "/"})])



(defn footer []
  [:footer {:class "pv4 ph3 ph5-m ph6-l mid-gray"}
   [:small {:class "f6 db tc"}
    "© 2022 "
    [:b {:class "ttu"} "SimpleGyn"]
    "., All Rights Reserved"]
   [:div {:class "tc mt3"}
    [:a {:class "f6 dib ph2 link mid-gray dim"
         :href "/language" :title "Language"}
     "Language"]
    [:a {:class "f6 dib ph2 link mid-gray dim"
         :href "/terms" :title "Terms"}
     "Terms of Use"]
    [:a {:class "f6 dib ph2 link mid-gray dim"
         :href "/privacy" :title "Privacy"}
     "Privacy"]]])



(defn post-summary [post]
  [:article
   [:a {:class "db pv4 ph3 ph0-l no-underline black dim"
        :href (str "/p/" (:slug post))}
    [:div {:class "w-100"}
     [:h1 {:class "f3 fw1 baskerville mt0 lh-title"}
      (:title post)]
     [:p {:class "f6 f5-l lh-copy"}
      (:summary post)]
     [:p {:class "f6 lh-copy mv0"}
      (str "By " (:author post))]]]])



(defn section-posts-summary [posts]
  [:section
   {:class "mw6 center avenir black-80"}
   #_[:h2 {:class "baskerville fw1 ph3 ph0-l"}
      "Posts"]
   (->> posts
        (map post-summary)
        (interpose [:div {:class "bb b--black-10"}] ))])



(defn quote1 [text author]
  [:div {:class "pb3 mt3"}
   [:blockquote {:class "athelas ml0 mv0 pl4 black-90 bl bw2 b--light-pink"}
    [:p {:class "f4 lh-copy measure mt0"}
     (str "„" text "“")]
    [:cite {:class "f6 ttu tracked fs-normal"}
     (str "― " author)]]])


(defn quote2 [text]
  [:blockquote {:class "athelas ph0 pv2 mh0 tc b i measure"}
   [:p {:class "f4 lh-copy"}
    text]])


(defn paragraph
  ([text] (paragraph {} text))
  ([opts text]
   [:p (-> {:class "lh-copy measure"}
           (merge-opts opts))
    text]))


(defn article-title [title author]
  [:header {:class "mb4"}
   [:h1 {:class "mt4 mb3 lh-title"}
    title]
   [:time {:class "f6 ttu tracked gray"}
    author]])



(def posts
  [{:title "Dankbarkeitjournal"
    :author "Mariana Munteanu"
    :slug "1"
    :summary "Neuroplastizität (die Fähigkeit des Gehirns, sich als
       Reaktion auf das Denken zu verändern) kann sowohl für uns als
       auch gegen uns arbeiten, denn das, worüber wir am meisten
       nachdenken, wird wachsen – das gilt sowohl für das Positive als
       auch für das Negative."
    :post
    [:section {:class "mw6 center avenir ph3 ph0-l"}

     (article-title "Dankbarkeitjournal" "Mariana Munteanu")
     
     [:div
      (quote1
       "Lasst den Geist eures Denkens erneuern und zieht euer neues Ich an."
       "Epheser 4:23")
      
      (paragraph
       "Neuroplastizität (die Fähigkeit des Gehirns, sich als Reaktion
     auf das Denken zu verändern) kann sowohl für uns als auch gegen
     uns arbeiten, denn das, worüber wir am meisten nachdenken, wird
     wachsen – das gilt sowohl für das Positive als auch für das
     Negative.")

      (paragraph "Datum:")

      (paragraph {:class "b"}
                 "Atme 5 Mal tief ein und aus!")

      (quote2
       [:span
        "Ich schöpfe meine Welt heute…" [:br]
        "Ich bin wundervoll, ich bin geliebt!"])

      (paragraph {:class "underline b"}
                 "Drei Dinge, für die ich heute dankbar bin:")
      (paragraph {:style {:border-bottom "1px dotted"}} "1.")
      (paragraph {:style {:border-bottom "1px dotted"}} "2.")
      (paragraph {:style {:border-bottom "1px dotted"}} "3.")


      [:h2 {:class "pt4"} "Morgenreflektion"]

      (paragraph {:class "b"}
                 "Sei liebevoll zu Dir selbst:")
      (paragraph {:class "b"}
                 "in Gedanken, zu Deinem Körper und Deiner Seele.")
      (paragraph
       "Wie kann ich heute Liebe gegenüber mir selbst zeigen:")

      (paragraph {:style {:border-bottom "1px dotted"}} [:br])
      (paragraph {:style {:border-bottom "1px dotted"}} [:br])
      (paragraph {:style {:border-bottom "1px dotted"}} [:br])

      [:br]

      (paragraph {:class "b"}
                 "Lerne zu leben und sammele Erinnerungen.")

      (paragraph {:class "i"}
                 "Was würdest Du heute gerne Neues ausprobieren?")

      (paragraph {:style {:border-bottom "1px dotted"}} [:br])
      (paragraph {:style {:border-bottom "1px dotted"}} [:br])
      (paragraph {:style {:border-bottom "1px dotted"}} [:br])

      [:br]

      (paragraph {:class "b"}
                 "Sehe das Gute, sei das Gute.")
      (paragraph {:class "b i"}
                 "Wie kann ich heute anderen helfen?")

      (paragraph {:style {:border-bottom "1px dotted"}} [:br])
      (paragraph {:style {:border-bottom "1px dotted"}} [:br])
      (paragraph {:style {:border-bottom "1px dotted"}} [:br])

      [:h2 {:class "pt4"}
       "Freie Übung zur Auswahl:"]

      (paragraph
       "– Gedanklich Segen schenken")
      (paragraph
       "– Innere Fragen und Gedanken aufschreiben")
      (paragraph
       "– Wie fühlt sich meine Seele heute (im Wort oder aufzeichnen)")]]}


   
   {:title "Allgemeine Schritte"
    :author "Mariana Munteanu"
    :slug "2"
    :summary "Diät: Keto-diät.Diät nach Budwig Eigene Gesundheit in
       eigenen Händen nehmen!"

    :post
    [:section {:class "mw6 center avenir ph3 ph0-l"}

     (article-title "Allgemeine Schritte" "Mariana Munteanu")

     [:ol {:start 1}
      [:li (paragraph
            [:span
             "Diät: Keto-diät." [:br]
             "Diät nach Budwig."])]]

     [:ol {:start 2}
      [:li (paragraph
            [:span
             "Eigene Gesundheit in eigenen Händen nehmen!" [:br]
             "Buch zu empfehlen: "
             [:a {:href "https://www.amazon.de/-/en/Dr-Kelly-Turner/dp/3424152684/ref=sr_1_1?crid=O5CJARLXUAB7"}
              "9 Wege in ein krebsfreies Leben: Wahre Geschichten von
              geheilten Menschen"]
             ", von Kelly A. Turner."])]]
     
     [:ol {:start 3}
      [:li (paragraph
            "Stärken das Immunsystem: Ernährung, in der Natur,
            Meditation, Yoga, Vitamine und Mineralien.")]]


     [:ol {:start 4}
      [:li (paragraph
            "Gedanken, Seele und Emotionen in Ordnung bringen.
Lernen sich selbst zu lieben und innere Konflikte zu lösen. Offen für
Neues werden.")]]


     [:ol {:start 5}
      [:li (paragraph
            "Täglich Portion Lachen: Film schauen, Witze lesen…")]]



     [:ol {:start 6}
      [:li (paragraph
            "Dankbarkeit-Journal täglich halten: Gehirn lernt dadurch
     positive Gedanken zu erstellen.")]]]}])




(defn index []
  [:div
   [:header {:class "pv2 tc serif"}
    (logo)
    (nav)]
   
   ;;[section-posts-summary posts]
   
   ;;(:post (first posts))
   (:post (second posts))
   
   (footer)])

