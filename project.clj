(defproject clj-htmltopdf "0.1-alpha6"
  :description  "Simple Clojure wrapper for Open HTML to PDF"
  :url          "https://github.com/gered/clj-htmltopdf"
  :license      {:name "GNU Lesser General Public License v3.0"
                 :url  "https://www.gnu.org/licenses/lgpl.html"}

  :dependencies [[com.openhtmltopdf/openhtmltopdf-core "0.0.1-RC13"]
                 [com.openhtmltopdf/openhtmltopdf-pdfbox "0.0.1-RC13"]
                 [com.openhtmltopdf/openhtmltopdf-rtl-support "0.0.1-RC13"]
                 [com.openhtmltopdf/openhtmltopdf-svg-support "0.0.1-RC13"]
                 [org.jsoup/jsoup "1.11.3"]
                 [commons-io/commons-io "2.5"]
                 [hiccup "1.0.5"]]

  :profiles     {:provided
                 {:dependencies [[org.clojure/clojure "1.9.0"]]}

                 :dev
                 {:dependencies [[pjstadig/humane-test-output "0.8.1"]]
                  :injections   [(require 'pjstadig.humane-test-output)
                                 (pjstadig.humane-test-output/activate!)]}})
