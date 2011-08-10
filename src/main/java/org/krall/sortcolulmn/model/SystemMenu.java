package org.krall.sortcolulmn.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class SystemMenu {

    @Id
    private Long id;
    @Basic
    private String name;

    @ManyToMany
    @OrderColumn(name = "display_sequence")
    List<SystemMenu> childMenus;

    public SystemMenu() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SystemMenu> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<SystemMenu> childMenus) {
        this.childMenus = childMenus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemMenu that = (SystemMenu) o;

        if (childMenus != null ? !childMenus.equals(that.childMenus) : that.childMenus != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (childMenus != null ? childMenus.hashCode() : 0);
        return result;
    }
}
