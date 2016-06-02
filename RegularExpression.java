// attention  if you want to math { } you need to add \
Pattern p = Pattern.compile("\\{query:\\s+\"(.*)\"\\}");

Matcher m = p.matcher(test_line);
if (m.matches()) {
  String someting= m.group(1);
