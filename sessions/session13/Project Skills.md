```mermaid
---
  title: Project Skills
---
classDiagram
    class Project {
        -List~Role~ roles
        +Project(Role... roles)
        +List~Role~ getRoles()
        +int getConformity(Set~Member~ team)
    }
    class Entry {
        -Level level
        -Skill skill
        +boolean equals(Object o)
        +String toString()
        +int compareTo(Entry e)
    }
    class Level {
        <<enumeration>>
        A1
        A2
        A3
    }
    class Position {
        <<enumeration>>
        DEVELOPER
        KEY_DEVELOPER
        TESTER
    }
    class Skill {
        <<enumeration>>
        JAVA
        DATABASE
        SPRING
        TESTING_TOOLS
        AWS
    }
    class Member {
        -String name
        -Level level
        -Set~Skill~ skills
        +Member(String name, Level level, Skill... skills)
        +String getName()
        +Level getLevel()
        +Set~Skill~ getSkills()
    }
     class Role {
        -Level level
        -Position position
        -Set~Skill~ skills
        +Role(Position position, Level level, Skill... skills)
        +Position getPosition()
        +Level getLevel()
        +Set~Skill~ getSkills()
    }
    Project --> Role : has many
    Project --> Entry : nested record
    Member --> Level : has a
    Member --> Skill : uses Set
    Role --> Level : has a
    Role --> Position : has a
    Role --> Skill : uses Set
```

Create a `Set<Entry`> ($Set_0$) from the `Roles` defined by the Project and then create a `Set<Entry>` ($Set_1$) from the `team` of type `Set<Member>`. And then computing de intersection between both sets.  $Set_0 \cap Set_1$ (`retainAll()`). $(\vert Set_0 \cap Set_1 \vert  * 100) / \vert Set_0 \vert$

