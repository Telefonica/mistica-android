#!/bin/bash

mkdir reports
touch reports/report.html
cp */build/outputs/roborazzi/*_compare.png reports/
files=$(find . -type f -name "*_compare.png" | grep "reports/")
{
  echo '<!doctype html>'
  echo '<html>'
    echo '<head>'
      echo '<title>Screenshots failure report</title>'
      echo '<link href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css" rel="stylesheet">'
      echo '<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">'
      echo '<meta charset="UTF-8">'
    echo '</head>'
    echo '<style>'
    echo 'body {'
      echo 'display: flex;'
      echo 'min-height: 100vh;'
      echo 'flex-direction: column;'
    echo '}'
    echo 'main {'
      echo 'flex: 1 0 auto;'
    echo '}'
    echo '</style>'
  echo '<body>'
  echo '<nav>'
    echo '<div class="nav-wrapper indigo darken-3">'
      echo '<a href="#" class="brand-logo left">Screenshots failure report</a>'
      echo '<ul id="nav-mobile" class="right hide-on-med-and-down">'
        echo '<li><a href="https://github.com/takahirom/roborazzi">Roborazzi</a></li>'
      echo '</ul>'
    echo '</div>'
  echo '</nav>'
  echo '<main class="container">'
    echo '<div class="section">'
    echo '<table class="highlight responsive-table">'
      echo '<tr><th>File name</th><th>Comparison</th></tr>'
} >> reports/report.html

      for file in $files; do
        # Get the file name and insert newlines every 100 characters
        fileName=$(basename "$file" | sed -r 's/(.{100})/\1<br>/g')
        echo "<tr><td>$(basename "$file")</td>" >> reports/report.html
        echo "<td><a href=\"$(basename "$file")\"><img src=\"$(basename "$file")\" width=\"100%\" height=\"100%\" /></a></td></tr>" >> reports/report.html
      done
{
      echo '</table>'
    echo '</div>'
  echo '</main>'
  echo '<footer class="page-footer indigo darken-3">'
    echo '<div></div>'
  echo '</footer>'
  echo '<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>'
  echo '</body></html>'
} >> reports/report.html

echo "Report: "
cat reports/report.html
