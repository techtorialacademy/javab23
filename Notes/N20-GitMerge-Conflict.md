# Git Conflicts
- A git conflict arises when Git cannot automatically reconsile differences
in a file between two commits(or branches) you're merging or pulling. Common reasons:
    1. Same Line Edits: Two people(co-worker) modify the same line or overlapping
  lines in different ways.
    2. Simultaneous Deletions/Modifications: One branch deletes a file while another
  modifies it. 
    3. Rename vs. Edit: One branch renames a file while the other branch edits the
  old file name. 
* In short, if Git cannot figure out which change should take precedence, it stops
and flags a conflict. You as a developer(coder) must decide how to handle differences.
### Git Conflict Markers
- When a conflict occurs locally, Git inserts markers such as:
```markdown
<<<<<<< HEAD
Your changes here
=======
Someone else's changes
>>>>>>> branch-to-merge
```
- In **GitHubs's** web editor, you must manully choose the changes and delete the
conflict markers, then mark the conflict as resolved.


