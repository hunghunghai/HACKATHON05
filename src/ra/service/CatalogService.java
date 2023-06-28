package ra.service;

import ra.model.Catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogService implements IService<Catalog, Integer> {
    private List<Catalog> catalogList;

    public CatalogService() {
        this.catalogList = new ArrayList<>();
    }

    @Override
    public List<Catalog> getAll() {
        return catalogList;
    }

    @Override
    public void save(Catalog catalog) {
        catalogList.add(catalog);
    }

    @Override
    public void findById(Integer catalogId) {
        for (Catalog catalog : catalogList) {
            if (catalog.getCatalogId() == catalogId) {
                System.out.println("Danh mục đã tìm thấy: " + catalog.toString());
                return;
            }
        }
        System.out.println("Danh mục có ID " + catalogId + " không tìm thấy.");
    }

    @Override
    public void delete(Integer catalogId) {
        for (Catalog catalog : catalogList) {
            if (catalog.getCatalogId() == catalogId) {
                catalogList.remove(catalog);
                System.out.println("Danh mục có ID " + catalogId + " đã xóa.");
                return;
            }
        }
        System.out.println("Danh mục có ID " + catalogId + " không tìm thấy.");
    }
}
