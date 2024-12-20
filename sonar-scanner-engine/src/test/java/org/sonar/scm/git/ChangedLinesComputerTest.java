    String example = """
      diff --git a/file-b1.xoo b/file-b1.xoo
      index 0000000..c2a9048
      --- a/foo
      +++ b/bar
      @@ -1 +0,0 @@
      -deleted line
      """;
    String example = """
      diff --git a/file-b1.xoo b/file-b1.xoo
      index 0000000..c2a9048
      --- a/foo
      +++ b/bar
      @@ -0,0 +1 @@
      +added line
      """;
    String example = """
      diff --git a/file-b1.xoo b/file-b1.xoo
      index 0000000..c2a9048
      --- a/foo
      +++ b/bar
      @@ -1 +1,3 @@
       unchanged line
      +added line 1
      +added line 2
      """;
    String example = """
      diff --git a/lao b/lao
      index 635ef2c..5af88a8 100644
      --- a/lao
      +++ b/lao
      @@ -1,7 +1,6 @@
      -The Way that can be told of is not the eternal Way;
      -The name that can be named is not the eternal name.
       The Nameless is the origin of Heaven and Earth;
      -The Named is the mother of all things.
      +The named is the mother of all things.
      +
       Therefore let there always be non-being,
         so we may see their subtlety,
       And let there always be being,
      @@ -9,3 +8,6 @@ And let there always be being,
       The two are the same,
       But after they are produced,
         they have different names.
      +They both may be called deep and profound.
      +Deeper and more profound,
      +The door of all subtleties!
      """;
    String example = """
      diff --git a/lao b/lao
      new file mode 100644
      whatever \
      other \
      surprise header lines git might throw at us...
      index 635ef2c..5af88a8 100644
      --- a/lao
      +++ b/lao
      @@ -1,7 +1,6 @@
      -The Way that can be told of is not the eternal Way;
      -The name that can be named is not the eternal name.
       The Nameless is the origin of Heaven and Earth;
      -The Named is the mother of all things.
      +The named is the mother of all things.
      +
       Therefore let there always be non-being,
         so we may see their subtlety,
       And let there always be being,
      @@ -9,3 +8,6 @@ And let there always be being,
       The two are the same,
       But after they are produced,
         they have different names.
      +They both may be called deep and profound.
      +Deeper and more profound,
      +The door of all subtleties!
      """;
    String example = """
      diff --git a/file-b1.xoo b/file-b1.xoo
      index 0000000..c2a9048
      --- a/foo
      +++ b/bar
      @@ -1 +x1,3 @@
       unchanged line
      +added line 1
      +added line 2
      """;